package me.achumak.theater;

final class Generator {
    // UTIL CLASS USED TO CREATE JOOQ SCHEMA
    public static void main(String[] args) throws Exception {
        org.jooq.util.GenerationTool.main(new String[]{"./src/main/resources/sql/jooq-gen.xml"});
    }
}
