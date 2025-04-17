import java.io.*;
import java.nio.file.*;

public class App {

    public static void main(String[] args) {
        // VS Code settings.json path
        String userHome = System.getProperty("user.home");
        String settingsPath = userHome + "/AppData/Roaming/Code/User/settings.json"; // Windows
        // String settingsPath = userHome + "/Library/Application Support/Code/User/settings.json"; // macOS
        // String settingsPath = userHome + "/.config/Code/User/settings.json"; // Linux

        try {
            String content = new String(Files.readAllBytes(Paths.get(settingsPath)));

            if (content.trim().isEmpty()) {
                content = "{}"; // If file is empty, initialize JSON
            }

            String colorOverrides = "\"workbench.colorCustomizations\": {\r\n" + //
                                "        // \"editor.background\": \"#1E1E2E\",\r\n" + //
                                "        // \"editor.foreground\": \"#E0DEF4\",\r\n" + //
                                "        \"terminal.background\": \"#01092a\",\r\n" + //
                                "        \"terminal.foreground\": \"#54a2cb\"\r\n" + //
                                "    }";

            String updatedContent;
            if (content.contains("\"workbench.colorCustomizations\"")) {
                updatedContent = content.replaceAll(
                        "\"workbench.colorCustomizations\"\\s*:\\s*\\{[^}]*\\}",
                        colorOverrides);
            } else {
                updatedContent = content.replaceAll("\\}\\s*$", ",\n" + colorOverrides + "\n}");
            }

            Files.write(Paths.get(settingsPath), updatedContent.getBytes());
            System.out.println("VS Code theme updated successfully!");

        } catch (IOException e) {
            System.out.println("Failed to update settings.json: " + e.getMessage());
        }
    }
}
