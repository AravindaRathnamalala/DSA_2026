package binary_search

import java.util.concurrent.ConcurrentHashMap


class TimeBasedKeyValueStore {

    val cMap = ConcurrentHashMap<String, MutableList<Pair<Int, String>>>()

    fun set(key: String, value: String, timestamp: Int) {
        cMap.getOrPut(key) { mutableListOf() }.add(timestamp to value)
    }

    fun get(key: String, timestamp: Int): String {
        val list = cMap[key] ?: return ""

    }
}