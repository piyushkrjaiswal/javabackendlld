package dev.pkj.javabackendlld.designpatterns.builder;

public class DatabaseConfiguration {
    public static void main(String[] args) {
        DatabaseConfigurationBuilder databaseConfigurationBuilder = DatabaseConfigurationBuilder.getBuilder()
                                                                    .setDbname("postgres")
                                                                        .setUsername("postgres")
                                                                            .setPassword("password")
                                                                                .setReadOnly(true)
                                                                                    .build();
    }
}
