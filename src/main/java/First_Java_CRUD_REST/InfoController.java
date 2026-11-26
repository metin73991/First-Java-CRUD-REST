package First_Java_CRUD_REST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class InfoController {

    @GetMapping("/api/info")
    public Map<String, String> getAppInfo() {
        return Map.of(
                "studentId", "73991",
                "applicationName", "First-Java-CRUD-REST",
                "version", "1.0.0"
        );
    }
}