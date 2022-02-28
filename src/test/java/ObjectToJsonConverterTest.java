
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ObjectToJsonConverterTest {

    @Test
    void givenObjectSerializedThenTrueReturned() throws JsonSerializationException {
        // Arrange
        Person person = new Person("soufiane", "cheouati", "34");
        ObjectToJsonConverter serializr = new ObjectToJsonConverter();

        // Act
        String jsonString = serializr.convertToJson(person);

        // Assert
        String exoected = "{\"personAge\":\"34\",\"firstName\":\"Soufiane\",\"lastName\":\"Cheouati\"}";
        assertEquals(exoected, jsonString);
    }

}