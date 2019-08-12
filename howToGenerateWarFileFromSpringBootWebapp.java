import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ProjectName extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ProjectName.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ProjectName.class);
    }

}

// make sure your main class should contain configure and return type as SpringApplicationBuilder override from SpringBootServletInitializer(line:7 and 13)
