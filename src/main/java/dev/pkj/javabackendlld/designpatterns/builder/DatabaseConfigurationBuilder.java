package dev.pkj.javabackendlld.designpatterns.builder;

public class DatabaseConfigurationBuilder {
    private String dbUrl;
    private String dbname;
    private String username;
    private String password;
    private boolean isReadOnly;

    private DatabaseConfigurationBuilder(Builder builder) {
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String dbUrl;
        private String dbname;
        private String username;
        private String password;
        private boolean isReadOnly;

        public String getDbUrl() {
            return dbUrl;
        }

        public Builder setDbUrl(String dbUrl) {
            this.dbUrl = dbUrl;
            return this;
        }

        public String getDbname() {
            return dbname;
        }

        public Builder setDbname(String dbname) {
            this.dbname = dbname;
            return this;
        }

        public String getUsername() {
            return username;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public boolean isReadOnly() {
            return isReadOnly;
        }

        public Builder setReadOnly(boolean readOnly) {
            isReadOnly = readOnly;
            return this;
        }

        public DatabaseConfigurationBuilder build() {
            return new DatabaseConfigurationBuilder(this);
        }
    }


}
