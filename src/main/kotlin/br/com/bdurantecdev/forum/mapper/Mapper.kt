package br.com.bdurantecdev.forum.mapper

interface Mapper<T, U> {
    fun map(t: T): U
}