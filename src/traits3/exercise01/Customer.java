package traits3.exercise01;

public class Customer {
        private String name;
        private String category;
        private Integer age;

    public Integer getAge() {
        return age;
    }

    public Customer(String name, String category,Integer age) {
            this.name = name;
            this.category = category;
            this.age=age;
        }

        public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }

    }


