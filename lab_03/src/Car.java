public class Car {
    public static final int LATEST_ALLOWED_YEAR = 1985;
    public static final String DEFAULT_CAR_MODEL = "Unknown";
    public static final CarTypeEnum DEFAULT_CAR_TYPE = CarTypeEnum.HATCHBACK;

    private String model;
    private Integer year;
    private final CarTypeEnum type;
    private final Engine engine;

    public enum CarTypeEnum {
        SEDAN,
        SUV,
        HATCHBACK
    }

    public Car(String model, Integer year, CarTypeEnum type, Engine engine) {
        this.model = model;
        this.year = year;
        this.type = type;
        this.engine = engine;
    }

    public Car() {
        this.model = DEFAULT_CAR_MODEL;
        this.year = LATEST_ALLOWED_YEAR;
        this.type = DEFAULT_CAR_TYPE;
        this.engine = Engine.defaultEngine();
    }


    @Override
    public String toString() {
        return "Model: " + model + ", Year: " + year + ", Type: " + type + ", Engine: " + engine;
    }

    public void showDetails() {
        System.out.println(this);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        if (year < LATEST_ALLOWED_YEAR) {
            throw new IllegalArgumentException("Year must be at least " + LATEST_ALLOWED_YEAR);
        }

        this.year = year;
    }

    public String getType() {
        return type.toString();
    }

    public static class Engine {
        public static final int DEFAULT_HORSEPOWER = 100;
        public static final EngineTypeEnum DEFAULT_ENGINE_TYPE = EngineTypeEnum.DIESEL;

        private Integer horsepower;
        private EngineTypeEnum type;

        public enum EngineTypeEnum {
            DIESEL,
            PETROL,
            ELECTRIC,
            HYBRID
        }

        public Engine(Integer horsepower, EngineTypeEnum type) {
            this.horsepower = horsepower;
            this.type = type;
        }

        public static Engine defaultEngine() {
            return new Engine(DEFAULT_HORSEPOWER, DEFAULT_ENGINE_TYPE);
        }

        @Override
        public String toString() {
            return "Horsepower: " + horsepower + ", Type: " + type;
        }

        public Integer getHorsepower() {
            return horsepower;
        }

        public void setHorsepower(Integer horsepower) {
            this.horsepower = horsepower;
        }

        public String getType() {
            return type.toString();
        }

        public void setType(EngineTypeEnum type) {
            this.type = type;
        }
    }
}

