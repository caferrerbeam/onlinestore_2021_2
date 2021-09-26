package edu.eam.ingesoft.onlinestore.model

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "tbl_tienda")
data class Store(
    @Id
    @Column(name = "id_tienda")
    var id: Long,

    @Column(name = "direccion")
    var address: String,

    @Column(name = "nombre")
    var name: String,

    @JoinColumn(name = "id_ciudad")
    @ManyToOne
    var city: City
) : Serializable
