package com.SD.RestService.RestService;
import org.springframework.web.bind.annotation.*;


@RestController
    public class RestControl {
    @GetMapping("/hola/{id}")
    public String Helloid(@PathVariable String id) {

        return "Hola como estan" + id;

    }

    @GetMapping("/hola")
    public String Hello() {

        return "Hola como estan";

    }

    @GetMapping("/prueba")
    public int Prueba() {
        int result = 2 + 5;


        return result;

    }

    @PostMapping("/hola/{id}")
    @ResponseBody
    public String holaPost(@PathVariable String id) {

        return id;

    }


    @PostMapping("/sumar")
    public int Suma(@RequestParam("num1") int num1 , @RequestParam("num2") int num2 ) {

        return num1 + num2;
    }

    @PostMapping("/nombre")
    public String Hola(@RequestParam("nombre") String nombre ) {

        return "hola señor " + nombre;
    }

    @PostMapping("/name")
    public String Hola1( ) {

        return "hola señor ";
    }

}

