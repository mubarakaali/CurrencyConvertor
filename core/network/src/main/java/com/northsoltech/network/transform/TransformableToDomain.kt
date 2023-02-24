package com.northsoltech.network.transform

interface TransformableToDomain<DATA_MODEL,DOMAIN_MODEL>{
     fun toDomain(dataObject: DATA_MODEL): DOMAIN_MODEL
}