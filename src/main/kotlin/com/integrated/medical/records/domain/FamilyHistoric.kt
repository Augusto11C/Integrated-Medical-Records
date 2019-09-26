package com.integrated.medical.records.domain

import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "FAMILY_HISTORIC", schema = "MEDICAL_RECORDS")
data class FamilyHistoric(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "ID_FAMILY_HISTORIC", nullable = false, unique = true)
        val idFamilyHistoric: Int,

        @Column(name = "DESCRIPTION", length = 500)
        @NotNull
        val description: String

) {

    @ManyToOne
    @JoinColumn(name = "ID_PATIENT")
    lateinit var patient: Patient

}