
package seg3x02.demo

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenApiConfig {

    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Calculatrice REST - Laboratoire 6")
                    .version("1.0.0")
                    .description(
                        "API REST développée avec Kotlin et Spring Boot " +
                        "permettant d'effectuer des opérations " +
                        "d'addition, de soustraction, de multiplication et de division."
                    )
            )
    }
}
