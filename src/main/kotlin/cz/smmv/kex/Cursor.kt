package cz.smmv.kex

import android.database.Cursor
import java.util.UUID

fun Cursor.getUUID(columnIndex : Int) : UUID? = if (isNull(columnIndex)) null else UUID.fromString(getString(columnIndex))
