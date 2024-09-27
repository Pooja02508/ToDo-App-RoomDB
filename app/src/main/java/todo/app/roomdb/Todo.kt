package todo.app.roomdb

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.Date

@Entity(tableName = "Todo")
data class Todo(
    @PrimaryKey(autoGenerate = true)
    var id: Int =0,
    var title : String,
    var createdAt : Date,

)