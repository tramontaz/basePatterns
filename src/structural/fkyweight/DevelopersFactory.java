package structural.fkyweight;

import java.util.HashMap;
import java.util.Map;

class DevelopersFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    Developer getDevelopersBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);
        if (developer == null){
            switch (specialty) {
                case "java":
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring C++ developer...");
                    developer = new CppDeveloper();
                    break;
            }
            developers.put(specialty, developer);
        }return developer;
    }
}
