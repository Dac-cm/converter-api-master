
package seg3x02.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calculator")
class CalculatorController {

    @GetMapping("/add/{nombre1}/{nombre2}")
    fun add(
        @PathVariable("nombre1") nombre1: Double,
        @PathVariable("nombre2") nombre2: Double
    ): Double {
        return nombre1 + nombre2
    }

    @GetMapping("/subtract/{nombre1}/{nombre2}")
    fun subtract(
        @PathVariable("nombre1") nombre1: Double,
        @PathVariable("nombre2") nombre2: Double
    ): Double {
        return nombre1 - nombre2
    }

    @GetMapping("/multiply/{nombre1}/{nombre2}")
    fun multiply(
        @PathVariable("nombre1") nombre1: Double,
        @PathVariable("nombre2") nombre2: Double
    ): Double {
        return nombre1 * nombre2
    }

    @GetMapping("/divide/{nombre1}/{nombre2}")
    fun divide(
        @PathVariable("nombre1") nombre1: Double,
        @PathVariable("nombre2") nombre2: Double
    ): Double {
        require(nombre2 != 0.0) {
            "Cannot divide by zero"
        }

        return nombre1 / nombre2
    }
}
