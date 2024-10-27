package HomeWork4.macronutrientMeals.factories;

public class AbstractMacronutrientFactory {
    private static CarbsFactory carbsFactory;
    private static ProteinFactory proteinFactory;
    private static FatsFactory fatsFactory;

    private AbstractMacronutrientFactory() { }

    public static CarbsFactory getCarbsFactory() {
        if (carbsFactory == null) {
            carbsFactory = new CarbsFactory();
        }
        return carbsFactory;
    }

    public static ProteinFactory getProteinFactory() {
        if (proteinFactory == null) {
            proteinFactory = new ProteinFactory();
        }
        return proteinFactory;
    }

    public static FatsFactory getFatsFactory() {
        if (fatsFactory == null) {
            fatsFactory = new FatsFactory();
        }
        return fatsFactory;
    }
}

