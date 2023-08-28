package com.softserve.edu04.pt.pt3;

import java.util.Scanner;
import com.softserve.edu04.pt.pt3.Continent;
public class CountryOfContinent {
    private String country;
    public CountryOfContinent() {

    }

    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Write the country: ");
        String country = SCANNER.nextLine();
        switch (country.toLowerCase()) {
            case "ukraine", "albania",  "latvia", "andorra", "liechtenstein", "armenia", "lithuania", "austria", "luxembourg",
                    "azerbaijan", "malta", "belarus", "moldova", "belgium", "monaco", "bosnia and herzegovina", "montenegro",
                    "bulgaria", "netherlands", "croatia", "norway", "cyprus", "poland", "czech republic", "portugal", "denmark",
                    "romania", "estonia", "russia", "finland", "san marino", "former yugoslav republic of macedonia",
                    "serbia", "france", "slovakia", "china", "india", "pakistan", "japan" -> System.out.println(Continent.EURASIA);
            case "canada", "the united states of america", "mexico" -> System.out.println(Continent.NORTHAMERICA);
            case "antarctida" -> System.out.println(Continent.ANTARCTIDA);
            case "argentina", "bolivia", "brazil", "chile", "colombia", "ecuador", "guyana", "paraguay", "peru", "suriname",
                    "uruguay", "venezuela" -> System.out.println(Continent.SOUTHAMERICA);
            case "australia" -> System.out.println(Continent.AUSTRALIA);
            case "algeria", "angola", "benin", "botswana", "burkina faso", "burundi", "cameroon", "cape verde",
                    "central african republic", "chad", "comoros", "congo", "ivory coast", "djibouti", "egypt",
                    "equatorial guinea", "eritrea", "ethiopia", "gabon", "gambia", "ghana", "guinea", "guinea-bissau",
                    "kenya", "lesotho", "liberia", "libya", "madagascar", "malawi", "mali", "mauritania", "mauritius",
                    "morocco", "mozambique", "namibia", "niger", "nigeria", "rwana", "sao tome and principe", "senegal",
                    "seychelles", "sierra leone", "somalia", "south africa", "sudan", "swaziland", "tanzania", "togo",
                    "iunisia", "uganda", "zambia", "zimbabwe" -> System.out.println(Continent.AFRIKA);
            default -> throw new IllegalArgumentException("You country is not really! Try to wright again");
        }

    }
}
