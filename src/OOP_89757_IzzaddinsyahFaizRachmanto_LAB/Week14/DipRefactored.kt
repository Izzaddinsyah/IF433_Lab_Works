package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week14

interface Database {
    fun query(sql: String): List<String>
}

class PostgresDatabase : Database {
    override fun query(sql: String) = listOf("pg_data1", "pg_data2")
}