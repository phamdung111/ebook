package Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "Entitys")
public class EbShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbShopApplication.class, args);
	}

}
