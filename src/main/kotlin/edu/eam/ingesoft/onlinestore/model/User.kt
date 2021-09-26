package edu.eam.ingesoft.onlinestore.model

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "tbl_usuarios")
data class User(
    @Id
    @Column(name = "id_usuario")
    val id: String,

    @Column(name = "nombre")
    var name: String,

    @Column(name = "apellido")
    var lastName: String,

    @Column(name = "direccion")
    var address: String,

    @JoinColumn(name = "id_ciudad")
    @ManyToOne
    var city: City
) : Serializable
