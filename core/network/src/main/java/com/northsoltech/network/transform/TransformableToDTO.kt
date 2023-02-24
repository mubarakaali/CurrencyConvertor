package com.northsoltech.network.transform

interface TransformableToDTO<DATA_MODEL,DOMAIN_MODEL> {
    fun fromDomain(dto:DOMAIN_MODEL):DATA_MODEL
}