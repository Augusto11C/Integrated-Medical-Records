package com.integrated.medical.records.domain

import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "HEALTH_INSURANCE", schema = "MEDICAL_RECORDS")
class HealthInsurance (


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "ID_HEALTH_INSURANCE", nullable = false, unique = true)
        val idHealthInsurance: Int,


        @Column(name = "HEALTH_INSURANCE_COMPANY", length = 255)
        @NotNull
        val healthInsuranceCompany: String,


        @Column(name = "HEALTH_INSURANCE_NAME", length = 360)
        @NotNull
        val healthInsuranceName: String,

        @Column(name = "INSURANCE_CARD_NUMBER", length = 30)
        @NotNull
        val insuranceCardNumber: String,

        @Column(name = "CARD_EXPIRATION_DATE")
        @NotNull
        val cardExpirationDate: Int
        //042021 == 04/2021


) {

    @ManyToOne
    @JoinColumn(name = "ID_PATIENT")
    lateinit var patient: Patient

}