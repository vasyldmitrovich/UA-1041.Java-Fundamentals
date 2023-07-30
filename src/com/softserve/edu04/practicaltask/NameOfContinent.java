package src.com.softserve.edu04.practicaltask;

import static src.com.softserve.edu03.homework1.Main.SCANNER;
import static src.com.softserve.edu04.practicaltask.Continent.*;

public class NameOfContinent {
    private String nameCont;

    public NameOfContinent() {

    }

    public NameOfContinent(String nameCont) {
        this.nameCont = nameCont;
    }

    public static void promptContName(NameOfContinent name) {
        System.out.print("Input the name of the country: ");
        String countryName = SCANNER.nextLine();
        name.setNameCont(countryName);
        System.out.print("Name of the continent is: ");
        name.getContinentName(name);
    }

    public String getNameCont() {
        return nameCont;
    }

    public void setNameCont(String nameCont) {
        this.nameCont = nameCont;
    }

    public void getContinentName(NameOfContinent name) {
        switch (getNameCont().toLowerCase()) {
            case "algeria", "angola", "benin", "botswana", "burkina faso", "burundi", "cabo verde", "cameroon",
                    "central african republic", "chad", "comoros", "congo", "democratic republic of the congo",
                    "djibouti", "egypt", "equatorial guinea", "eritrea", "eswatini", "ethiopia", "gabon", "gambia",
                    "ghana", "guinea", "guinea-bissau", "ivory coast", "kenya", "lesotho", "liberia", "libya",
                    "madagascar", "malawi", "mali", "mauritania", "mauritius", "morocco", "mozambique", "namibia",
                    "niger", "nigeria", "rwanda", "sao tome and principe", "senegal", "seychelles", "sierra leone",
                    "somalia", "south africa", "south sudan", "sudan", "tanzania", "togo", "tunisia", "uganda",
                    "zambia", "zimbabwe" -> System.out.println(AFRICA.getName());

            case "antarctica" -> System.out.println(ANTARCTICA.getName());

            case "afghanistan", "armenia", "azerbaijan", "bahrain", "bangladesh", "bhutan", "brunei", "cambodia",
                    "china", "cyprus", "georgia", "india", "indonesia", "iran", "iraq", "israel", "japan", "jordan",
                    "kazakhstan", "kuwait", "kyrgyzstan", "laos", "lebanon", "malaysia", "maldives", "mongolia",
                    "myanmar", "nepal", "north korea", "oman", "pakistan", "palestine", "philippines", "qatar",
                    "saudi arabia", "singapore", "south korea", "sri lanka", "syria", "tajikistan", "thailand",
                    "timor-leste", "turkey", "turkmenistan", "united arab emirates", "uzbekistan", "vietnam", "yemen" ->
                    System.out.println(ASIA.getName());

            case "albania", "andorra", "austria", "belarus", "belgium", "bosnia and herzegovina", "bulgaria", "croatia",
                    "czech republic", "denmark", "estonia", "finland", "france", "germany", "greece", "hungary",
                    "iceland", "ireland", "italy", "kosovo", "latvia", "liechtenstein", "lithuania", "luxembourg",
                    "malta", "moldova", "monaco", "montenegro", "netherlands", "north macedonia", "norway", "poland",
                    "portugal", "romania", "russia", "san marino", "serbia", "slovakia", "slovenia", "spain", "sweden",
                    "switzerland", "ukraine", "united kingdom", "vatican city" -> System.out.println(EUROPE.getName());

            case "antigua and barbuda", "bahamas", "barbados", "belize", "canada", "costa rica", "cuba", "dominica",
                    "dominican republic", "el salvador", "grenada", "guatemala", "haiti", "honduras", "jamaica",
                    "mexico", "nicaragua", "panama", "saint kitts and nevis", "saint lucia",
                    "saint vincent and the grenadines", "trinidad and tobago", "united states of america" ->
                    System.out.println(NORTH_AMERICA.getName());

            case "argentina", "bolivia", "brazil", "chile", "colombia", "ecuador", "guyana", "paraguay", "peru",
                    "suriname", "uruguay", "venezuela" -> System.out.println(SOUTH_AMERICA.getName());

            case "australia", "fiji", "kiribati", "marshall islands", "micronesia", "nauru", "new zealand", "palau",
                    "papua new guinea", "samoa", "solomon islands", "tonga", "tuvalu", "vanuatu" ->
                    System.out.println(AUSTRALIA.getName());

            default -> throw new IllegalArgumentException("Please make sure that you correct provide the name of the country");
        }
    }
}
