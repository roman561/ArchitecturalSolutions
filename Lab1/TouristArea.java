package edu.ua.khpi.architectural.solutions.lab1;

public class TouristArea {

        private String name;
        private String location;

        public TouristArea(String name, String location) {
            this.name = name;
            this.location = location;
        }

        public String getName() {
            return name;
        }

        public String getLocation() {
            return location;
        }

        @Override
        public String toString() {
            return "TouristArea{" +
                    "Name='" + name + '\'' +
                    ", Location='" + location + '\'' +
                    '}';
        }
    }