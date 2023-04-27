import java.sql.*;
import java.util.Scanner;

public class Pokemon {
    String name, move;
    int hp, movePower, speed;

    private Pokemon() {}

    public static Pokemon create() {
        Pokemon pokemon = new Pokemon();
        Scanner scanner = new Scanner(System.in);

        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:pokemon.db")) {
            Statement stmt = conn.createStatement();
            ResultSet result;
            PreparedStatement prepStmt;

            result = stmt.executeQuery("SELECT * FROM pokemon ORDER BY random() LIMIT 1");

            Pokemon autoValues = new Pokemon();

            // name
            {
                autoValues.name = result.getString("name");
                System.out.printf("Enter name (%s): ", autoValues.name);
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    pokemon.name = autoValues.name;
                } else {
                    pokemon.name = input;
                    prepStmt = conn.prepareStatement("SELECT * FROM pokemon WHERE name = ? COLLATE NOCASE LIMIT 1");
                    prepStmt.setString(1, pokemon.name);
                    result = prepStmt.executeQuery();
                    if (!result.next()) {
                        autoValues = null;
                    }
                }
            }

            // hp
            if (autoValues == null) {
                System.out.print("Enter HP: ");
                pokemon.hp = Integer.parseInt(scanner.nextLine());
            } else {
                autoValues.hp = result.getInt("hp");
                System.out.printf("Enter HP (%d): ", autoValues.hp);

                while (pokemon.hp == 0) {
                    if (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        if (line.isEmpty()) {
                            pokemon.hp = autoValues.hp;
                        } else {
                            pokemon.hp = parseInt(line);
                        }
                    }
                }
            }

            // speed
            if (autoValues == null) {
                System.out.print("Enter speed: ");
                pokemon.speed = Integer.parseInt(scanner.nextLine());
            } else {
                autoValues.speed = result.getInt("speed");
                System.out.printf("Enter speed (%d): ", autoValues.speed);
                while (pokemon.speed == 0) {
                    if (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        if (line.isEmpty()) {
                            pokemon.speed = autoValues.speed;
                        } else {
                            pokemon.speed = parseInt(line);
                        }
                    }
                }
            }

            // move name
            String type = result.getString("type1");
            if (type == null) { result.getString("type2"); }
            if (autoValues == null || type == null) {
                System.out.print("Enter move name: ");
                if (scanner.hasNextLine()) {
                    pokemon.move = scanner.nextLine();
                }
            } else {
                prepStmt = conn.prepareStatement("SELECT * FROM moves WHERE type == ? ORDER BY random() LIMIT 1");
                prepStmt.setString(1, type);
                result = prepStmt.executeQuery();
                autoValues.move = result.getString("name");
                System.out.printf("Enter move (%s): ", autoValues.move);
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    pokemon.move = autoValues.move;
                } else {
                    pokemon.move = input;
                    autoValues = null;
                }
            }
            if (autoValues == null) {
                prepStmt = conn.prepareStatement("SELECT * FROM moves WHERE name = ? COLLATE NOCASE LIMIT 1");
                prepStmt.setString(1, pokemon.move);
                result = prepStmt.executeQuery();
                if (result.next()) {
                    autoValues = new Pokemon();
                    autoValues.movePower = result.getInt("power");
                }
            }

            // move power
            if (autoValues == null) {
                System.out.print("Enter move power: ");
                pokemon.movePower = scanner.nextInt();
            } else {
                autoValues.movePower = result.getInt("power");
                System.out.printf("Enter speed (%d): ", autoValues.movePower);
                while (pokemon.movePower == 0) {
                    if (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        if (line.isEmpty()) {
                            pokemon.movePower = autoValues.movePower;
                        } else {
                            pokemon.movePower = parseInt(line);
                        }
                    }
                }
            }

            return pokemon;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private static int parseInt(String line) {
        try {
            int input = Integer.parseInt(line);
            if (input == 0) {
                System.out.println("Input can't be 0.");
            }
            return input;
        } catch (NumberFormatException e) {
            System.out.println("Input must be an integer.");
            return 0;
        }
    }
}
