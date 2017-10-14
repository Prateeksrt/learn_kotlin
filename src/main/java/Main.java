import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ClassRoom classRoom = gson.fromJson(readFile(), ClassRoom.class);

        List<Student> englishTopper = classRoom.students.stream()
                .sorted(Comparator.comparing(s -> s.getMarks().get(Subject.English)))
                .collect(Collectors.toList());
        Collections.reverse(englishTopper);

        List<Student> hindiTopper = classRoom.students.stream()
                .sorted(Comparator.comparing(s -> s.getMarks().get(Subject.Hindi)))
                .collect(Collectors.toList());
        Collections.reverse(hindiTopper);
        System.out.println(englishTopper.get(0));
        System.out.println(hindiTopper.get(0));
    }

    private static String readFile() {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("classRoom.json")))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
}
