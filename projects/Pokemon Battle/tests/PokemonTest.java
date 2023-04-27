import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class PokemonTest {

    @Nested
    @DisplayName("create")
    class Create {
        private static final InputStream systemIn = System.in;
        private static final PrintStream systemOut = System.out;

        private ByteArrayOutputStream testOut;

        @BeforeEach
        public void setUpOutput() {
            testOut = new ByteArrayOutputStream();
            System.setOut(new PrintStream(testOut));
        }
        @AfterAll
        public static void restoreSystemInputOutput() {
            System.setIn(systemIn);
            System.setOut(systemOut);
        }

        private void setInput(String data) {
            ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
            System.setIn(testIn);
        }
        private String getOutput() {
            return testOut.toString();
        }

        @Test
        @DisplayName("defaults")
        public void defaults() {
            setInput("\n\n\n\n\n");
            Pokemon pokemon = Pokemon.create();
            assertNotNull(pokemon.name);
            assertNotEquals(pokemon.hp, 0);
            assertNotEquals(pokemon.speed, 0);
            assertNotNull(pokemon.move);
            assertNotEquals(pokemon.movePower, 0);
        }

        @Test
        @DisplayName("custom values")
        public void custom() {
            String name = "SomePokemon", move = "SomeMove";
            int hp = 52, speed = 84, movePower = 61;
            setInput(String.join(
                    "\n",
                    name,
                    String.valueOf(hp),
                    String.valueOf(speed),
                    move,
                    String.valueOf(movePower)
            ));

            Pokemon pokemon = Pokemon.create();
            String output = getOutput();

            int i = output.indexOf('(') + 1;
            assertFalse(output.substring(i).contains("(")); // no defaults after name

            assertEquals(name, pokemon.name);
            assertEquals(hp, pokemon.hp);
            assertEquals(speed, pokemon.speed);
            assertEquals(move, pokemon.move);
            assertEquals(movePower, pokemon.movePower);
        }

        @Test
        @DisplayName("known name & defaults")
        public void knownNameAndDefaults() {
            String name = "Dusknoir";
            setInput(name + "\n\n\n\n\n");
            Pokemon pokemon = Pokemon.create();
            assertEquals(name, pokemon.name);
            assertNotEquals(pokemon.hp, 0);
            assertNotEquals(pokemon.speed, 0);
            assertNotNull(pokemon.move);
            assertNotEquals(pokemon.movePower, 0);
        }

        @Test
        @DisplayName("known name & move")
        public void knownNameAndMove() {
            String name = "Dusknoir", move = "Power Whip";
            int hp = 52, speed = 84, movePower = 61;
            setInput(String.join(
                    "\n",
                    name,
                    String.valueOf(hp),
                    String.valueOf(speed),
                    move,
                    String.valueOf(movePower)
            ));
            Pokemon pokemon = Pokemon.create();

            assertEquals(name, pokemon.name);
            assertEquals(hp, pokemon.hp);
            assertEquals(speed, pokemon.speed);
            assertEquals(move, pokemon.move);
            assertEquals(movePower, pokemon.movePower);
        }

        // all default
        // random name & random move (all custom)
        // known name & defaults
        // random name & known move (?)
        // known name & known move
    }
}