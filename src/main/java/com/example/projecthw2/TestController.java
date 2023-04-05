package com.example.projecthw2;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/hw2")

    public String hw2(HttpServletRequest httpServletRequest){

        Map<Integer,String> quotes= new HashMap<>();

        quotes.put(0,"Тепер, коли ми навчилися літати у повітрі, як птахи, плавати під водою, як риби, \n" +
                " нам не вистачає тільки одного: навчитися жити на землі, як люди.\n");
        quotes.put(1,"Не чекай, що стане легше, простіше, краще. Не стане. Труднощі будуть завжди.\n " +
                "Вчися бути щасливим прямо зараз. Інакше не встигнеш.\n"  +
                "Біль іноді йде, але думки-то залишаються.\n");
        quotes.put(2, "Якщо під музику не танцюють – це не музика\n");
        quotes.put(3,"– Скажіть, Дрісом, як ви думаєте, чому людей тягне до мистецтва?\n" +
                "– Може, тому що це прибутково?\n" +
                "– Ні, це єдиний спосіб залишити слід на землі.\n");
        quotes.put(4,"Прокласти свій шлях майже неможливо, якщо ступати весь час по чужих слідах.\n");
        quotes.put(5,"Наш припис призвів до того, що ми вкрали в дітей саме те, що допоможе їм стати сильними, — складнощі.\n");
        quotes.put(6,"Ідеальний чоловік - це чоловік, що вважає, що у нього ідеальна дружина. \n");
        quotes.put(7,"Життя - це не пошук себе. Життя - це створення себе. \n");
        quotes.put(8,"Люди, які вміють веселитися, не мають грошей, а люди, які мають гроші, не вміють веселитися. \n");
        quotes.put(9,"Людина - як цегла: обпалюючись, твердне.\n");

        quotes.put(10, "Please, enter the parametr = number from 0 to 9 to read the different texts");


        Map<String, String[]> parameters = httpServletRequest.getParameterMap();

        String key = parameters.keySet().toString();
        System.out.println(key.length());
        StringBuilder key1 = new StringBuilder();
        StringBuilder result = new StringBuilder();

        if (key.length()==3){
            key1.append(key.charAt(1));
            result = new StringBuilder(quotes.get(Integer.parseInt(key1.toString())));

        } else if (key.length() ==2) {
            for (int i = 0; i<quotes.keySet().size()-1;i+=1){
                result.append(quotes.get(i));
            }
        } else
        {
            result = new StringBuilder(quotes.get(10));
        }
        return result.toString();
    }
}
