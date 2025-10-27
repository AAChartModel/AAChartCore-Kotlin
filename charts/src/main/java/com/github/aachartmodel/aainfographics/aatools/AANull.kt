package com.github.aachartmodel.aainfographics.aatools

import com.google.gson.TypeAdapter
import com.google.gson.annotations.JsonAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonToken
import com.google.gson.stream.JsonWriter

//// 实现 Javascript 中的 null 值的效果
//@JsonAdapter(AANullObjectAdapter::class)
class AANull {
}
//
//// Adapter used for String properties: when the literal string "AANull" is encountered, output real JSON null
//class AANullAdapter : TypeAdapter<String>() {
//    override fun write(out: JsonWriter, value: String?) {
//        if (value == "AANull") {
//            out.nullValue() // 输出真正的 null
//        } else {
//            out.value(value)
//        }
//    }
//
//    override fun read(reader: JsonReader): String? {
//        return if (reader.peek() == JsonToken.NULL) {
//            reader.nextNull()
//            null
//        } else {
//            val result = reader.nextString()
//            if (result == "AANull") null else result
//        }
//    }
//}
//
//// Adapter used for AANull object properties: serialize any AANull instance as JSON null
//class AANullObjectAdapter : TypeAdapter<AANull>() {
//    override fun write(out: JsonWriter, value: AANull?) {
//        out.nullValue()
//    }
//
//    override fun read(reader: JsonReader): AANull? {
//        if (reader.peek() == JsonToken.NULL) {
//            reader.nextNull()
//        } else {
//            // Consume any unexpected token to keep the stream consistent
//            reader.skipValue()
//        }
//        return null
//    }
//}
