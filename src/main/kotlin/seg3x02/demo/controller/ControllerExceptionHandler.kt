
package seg3x02.demo.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ControllerExceptionHandler {

    @ExceptionHandler(IllegalArgumentException::class)
    fun handleIllegalArgument(
        ex: IllegalArgumentException
    ): ResponseEntity<Map<String, String>> {
        val body = mapOf(
            "error" to (ex.message ?: "Invalid request")
        )

        return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(body)
    }
}
