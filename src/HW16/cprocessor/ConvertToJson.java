package HW16.cprocessor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import org.json.simple.JSONObject;


public class ConvertToJson {

    public static String convertYamlToJson(String yaml) throws JsonProcessingException {
        ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
        Object obj = yamlReader.readValue(yaml, Object.class);

        ObjectMapper jsonWriter = new ObjectMapper();
        return jsonWriter.writeValueAsString(obj);
    }

    public static void Saver(String str, String path) throws IOException {
        OutputStream output = new FileOutputStream(path, true);
        if (!(Files.exists(Path.of(path)))) {
            Path file  = Files.createFile(Path.of(path));
        } else {
            output.write(str.getBytes(StandardCharsets.UTF_8));
        }
    }
}
