package com.rates.network.models.currency


import com.rates.domain.models.currency.ConversionRates
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ConversionRatesDto(
    @SerialName("AED")
    val aED:Double?,
    @SerialName("AFN")
    val aFN: Double?,
    @SerialName("ALL")
    val aLL: Double?,
    @SerialName("AMD")
    val aMD: Double?,
    @SerialName("ANG")
    val aNG: Double?,
    @SerialName("AOA")
    val aOA: Double?,
    @SerialName("ARS")
    val aRS: Double?,
    @SerialName("AUD")
    val aUD: Double?,
    @SerialName("AWG")
    val aWG: Double?,
    @SerialName("AZN")
    val aZN: Double?,
    @SerialName("BAM")
    val bAM: Double?,
    @SerialName("BBD")
    val bBD: Double?,
    @SerialName("BDT")
    val bDT: Double?,
    @SerialName("BGN")
    val bGN: Double?,
    @SerialName("BHD")
    val bHD: Double?,
    @SerialName("BIF")
    val bIF: Double?,
    @SerialName("BMD")
    val bMD: Double?,
    @SerialName("BND")
    val bND: Double?,
    @SerialName("BOB")
    val bOB: Double?,
    @SerialName("BRL")
    val bRL: Double?,
    @SerialName("BSD")
    val bSD: Double?,
    @SerialName("BTN")
    val bTN: Double?,
    @SerialName("BWP")
    val bWP: Double?,
    @SerialName("BYN")
    val bYN: Double?,
    @SerialName("BZD")
    val bZD: Double?,
    @SerialName("CAD")
    val cAD: Double?,
    @SerialName("CDF")
    val cDF: Double?,
    @SerialName("CHF")
    val cHF: Double?,
    @SerialName("CLP")
    val cLP: Double?,
    @SerialName("CNY")
    val cNY: Double?,
    @SerialName("COP")
    val cOP: Double?,
    @SerialName("CRC")
    val cRC: Double?,
    @SerialName("CUP")
    val cUP: Double?,
    @SerialName("CVE")
    val cVE: Double?,
    @SerialName("CZK")
    val cZK: Double?,
    @SerialName("DJF")
    val dJF: Double?,
    @SerialName("DKK")
    val dKK: Double?,
    @SerialName("DOP")
    val dOP: Double?,
    @SerialName("DZD")
    val dZD: Double?,
    @SerialName("EGP")
    val eGP: Double?,
    @SerialName("ERN")
    val eRN: Double?,
    @SerialName("ETB")
    val eTB: Double?,
    @SerialName("EUR")
    val eUR: Double?,
    @SerialName("FJD")
    val fJD: Double?,
    @SerialName("FKP")
    val fKP: Double?,
    @SerialName("FOK")
    val fOK: Double?,
    @SerialName("GBP")
    val gBP: Double?,
    @SerialName("GEL")
    val gEL: Double?,
    @SerialName("GGP")
    val gGP: Double?,
    @SerialName("GHS")
    val gHS: Double?,
    @SerialName("GIP")
    val gIP: Double?,
    @SerialName("GMD")
    val gMD: Double?,
    @SerialName("GNF")
    val gNF: Double?,
    @SerialName("GTQ")
    val gTQ: Double?,
    @SerialName("GYD")
    val gYD: Double?,
    @SerialName("HKD")
    val hKD: Double?,
    @SerialName("HNL")
    val hNL: Double?,
    @SerialName("HRK")
    val hRK: Double?,
    @SerialName("HTG")
    val hTG: Double?,
    @SerialName("HUF")
    val hUF: Double?,
    @SerialName("IDR")
    val iDR: Double?,
    @SerialName("ILS")
    val iLS: Double?,
    @SerialName("IMP")
    val iMP: Double?,
    @SerialName("INR")
    val iNR: Double?,
    @SerialName("IQD")
    val iQD: Double?,
    @SerialName("IRR")
    val iRR: Double?,
    @SerialName("ISK")
    val iSK: Double?,
    @SerialName("JEP")
    val jEP: Double?,
    @SerialName("JMD")
    val jMD: Double?,
    @SerialName("JOD")
    val jOD: Double?,
    @SerialName("JPY")
    val jPY: Double?,
    @SerialName("KES")
    val kES: Double?,
    @SerialName("KGS")
    val kGS: Double?,
    @SerialName("KHR")
    val kHR: Double?,
    @SerialName("KID")
    val kID: Double?,
    @SerialName("KMF")
    val kMF: Double?,
    @SerialName("KRW")
    val kRW: Double?,
    @SerialName("KWD")
    val kWD: Double?,
    @SerialName("KYD")
    val kYD: Double?,
    @SerialName("KZT")
    val kZT: Double?,
    @SerialName("LAK")
    val lAK: Double?,
    @SerialName("LBP")
    val lBP: Double?,
    @SerialName("LKR")
    val lKR: Double?,
    @SerialName("LRD")
    val lRD: Double?,
    @SerialName("LSL")
    val lSL: Double?,
    @SerialName("LYD")
    val lYD: Double?,
    @SerialName("MAD")
    val mAD: Double?,
    @SerialName("MDL")
    val mDL: Double?,
    @SerialName("MGA")
    val mGA: Double?,
    @SerialName("MKD")
    val mKD: Double?,
    @SerialName("MMK")
    val mMK: Double?,
    @SerialName("MNT")
    val mNT: Double?,
    @SerialName("MOP")
    val mOP: Double?,
    @SerialName("MRU")
    val mRU: Double?,
    @SerialName("MUR")
    val mUR: Double?,
    @SerialName("MVR")
    val mVR: Double?,
    @SerialName("MWK")
    val mWK: Double?,
    @SerialName("MXN")
    val mXN: Double?,
    @SerialName("MYR")
    val mYR: Double?,
    @SerialName("MZN")
    val mZN: Double?,
    @SerialName("NAD")
    val nAD: Double?,
    @SerialName("NGN")
    val nGN: Double?,
    @SerialName("NIO")
    val nIO: Double?,
    @SerialName("NOK")
    val nOK: Double?,
    @SerialName("NPR")
    val nPR: Double?,
    @SerialName("NZD")
    val nZD: Double?,
    @SerialName("OMR")
    val oMR: Double?,
    @SerialName("PAB")
    val pAB: Double?,
    @SerialName("PEN")
    val pEN: Double?,
    @SerialName("PGK")
    val pGK: Double?,
    @SerialName("PHP")
    val pHP: Double?,
    @SerialName("PKR")
    val pKR: Double?,
    @SerialName("PLN")
    val pLN: Double?,
    @SerialName("PYG")
    val pYG: Double?,
    @SerialName("QAR")
    val qAR: Double?,
    @SerialName("RON")
    val rON: Double?,
    @SerialName("RSD")
    val rSD: Double?,
    @SerialName("RUB")
    val rUB: Double?,
    @SerialName("RWF")
    val rWF: Double?,
    @SerialName("SAR")
    val sAR: Double?,
    @SerialName("SBD")
    val sBD: Double?,
    @SerialName("SCR")
    val sCR: Double?,
    @SerialName("SDG")
    val sDG: Double?,
    @SerialName("SEK")
    val sEK: Double?,
    @SerialName("SGD")
    val sGD: Double?,
    @SerialName("SHP")
    val sHP: Double?,
    @SerialName("SLE")
    val sLE: Double?,
    @SerialName("SLL")
    val sLL: Double?,
    @SerialName("SOS")
    val sOS: Double?,
    @SerialName("SRD")
    val sRD: Double?,
    @SerialName("SSP")
    val sSP: Double?,
    @SerialName("STN")
    val sTN: Double?,
    @SerialName("SYP")
    val sYP: Double?,
    @SerialName("SZL")
    val sZL: Double?,
    @SerialName("THB")
    val tHB: Double?,
    @SerialName("TJS")
    val tJS: Double?,
    @SerialName("TMT")
    val tMT: Double?,
    @SerialName("TND")
    val tND: Double?,
    @SerialName("TOP")
    val tOP: Double?,
    @SerialName("TRY")
    val tRY: Double?,
    @SerialName("TTD")
    val tTD: Double?,
    @SerialName("TVD")
    val tVD: Double?,
    @SerialName("TWD")
    val tWD: Double?,
    @SerialName("TZS")
    val tZS: Double?,
    @SerialName("UAH")
    val uAH: Double?,
    @SerialName("UGX")
    val uGX: Double?,
    @SerialName("USD")
    val uSD: Double?,
    @SerialName("UYU")
    val uYU: Double?,
    @SerialName("UZS")
    val uZS: Double?,
    @SerialName("VES")
    val vES: Double?,
    @SerialName("VND")
    val vND: Double?,
    @SerialName("VUV")
    val vUV: Double?,
    @SerialName("WST")
    val wST: Double?,
    @SerialName("XAF")
    val xAF: Double?,
    @SerialName("XCD")
    val xCD: Double?,
    @SerialName("XDR")
    val xDR: Double?,
    @SerialName("XOF")
    val xOF: Double?,
    @SerialName("XPF")
    val xPF: Double?,
    @SerialName("YER")
    val yER: Double?,
    @SerialName("ZAR")
    val zAR: Double?,
    @SerialName("ZMW")
    val zMW: Double?,
    @SerialName("ZWL")
    val zWL: Double?
){
    fun toConversionRatesDomain()=  ConversionRates(
        aED=aED,
        aFN=aFN,
        aLL=aLL,
        aMD=aMD,
        aNG=aNG,
        aOA=aOA,
        aRS=aRS,
        aUD=aUD,
        aWG=aWG,
        aZN=aZN,
        bAM=bAM,
        bBD=bBD,
        bDT=bDT,
        bGN=bGN,
        bHD=bHD,
        bIF=bIF,
        bMD=bMD,
        bND=bND,
        bOB=bOB,
        bRL=bRL,
        bSD=bSD,
        bTN=bTN,
        bWP=bWP,
        bYN=bYN,
        bZD=bZD,
        cAD=cAD,
        cDF=cDF,
        cHF=cHF,
        cLP=cLP,
        cNY=cNY,
        cOP=cOP,
        cRC=cRC,
        cUP=cUP,
        cVE=cVE,
        cZK=cZK,
        dJF=dJF,
        dKK=dKK,
        dOP=dOP,
        dZD=dZD,
        eGP=eGP,
        eRN=eRN,
        eTB=eTB,
        eUR=eUR,
        fJD=fJD,
        fKP=fKP,
        fOK=fOK,
        gBP=gBP,
        gEL=gEL,
        gGP=gGP,
        gHS=gHS,
        gIP=gIP,
        gMD=gMD,
        gNF=gNF,
        gTQ=gTQ,
        gYD= gYD,
        hKD=hKD,
        hNL=hNL,
        hRK=hRK,
        hTG=hTG,
        hUF=hUF,
        iDR=iDR,
        iLS=iLS,
        iMP=iMP,
        iNR=iNR,
        iQD=iQD,
        iRR=iRR,
        iSK=iSK,
        jEP=jEP,
        jMD=jMD,
        jOD=jOD,
        jPY=jPY,
        kES=kES,
        kGS=kGS,
        kHR=kHR,
        kID=kID,
        kMF=kMF,
        kRW=kRW,
        kWD=kWD,
        kYD=kYD,
        kZT=kZT,
        lAK=lAK,
        lBP=lBP,
        lKR=lKR,
        lRD=lRD,
        lSL=lSL,
        lYD=lYD,
        mAD=mAD,
        mGA=mGA,
        mKD=mKD,
        mMK=mMK,
        mNT=mNT,
        mOP=mOP,
        mRU=mRU,
        mUR=mUR,
        mVR=mVR,
        mWK=mWK,
        mXN=mXN,
        mYR=mYR,
        mZN=mZN,
        nAD=nAD,
        nGN=nGN,
        nIO=nIO,
        nOK=nOK,
        nPR=nPR,
        nZD=nZD,
        oMR=oMR,
        pAB=pAB,
        pEN=pEN,
        pGK=pGK,
        pHP=pHP,
        pKR=pKR,
        pLN=pLN,
        pYG=pYG,
        qAR=qAR,
        rON=rON,
        rSD=rSD,
        rUB=rUB,
        rWF=rWF,
        sAR=sAR,
        sBD=sBD,
        sCR=sCR,
        sDG=sDG,
        sEK=sEK,
        sGD=sGD,
        sHP=sHP
    )
}