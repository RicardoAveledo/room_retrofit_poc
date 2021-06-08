package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;


/**
 * Created by RicardoAveledo on 23/11/2020.
 */
@Entity(tableName = "casuisticaAcciones")
public class CasuisticaAcciones {

    @PrimaryKey
    @NonNull
    @SerializedName("ID_CASUISTICA_ACCIONES")
    private String id_casuistica_acciones;

    @SerializedName("TOTAL_REGISTROS")
    private String total_registros;

    @SerializedName("CLIENTE_EXCLUYENTE")
    private String cliente_excluyente;

    @SerializedName("TRABAJO_EXCLUYENTE")
    private String trabajo_excluyente;

    @SerializedName("TRABAJO")
    private String trabajo;

    @SerializedName("TIPO_TRABAJO")
    private String tipo_trabajo;

    @SerializedName("RETIRAR")
    private String retirar;

    @SerializedName("INSTALAR")
    private String instalar;

    @SerializedName("RETIRA_ADICIONAL")
    private String retira_adicional;

    @SerializedName("INSTALA_ADICIONAL")
    private String instala_adicional;

    @SerializedName("TECNOLOGIA_EXCLUYENTE")
    private String tecnologia_excluyente;

    @SerializedName("MODELO_INSTALADO_EXCLUYENTE")
    private String modelo_instalado_excluyente;

    @SerializedName("MODELO_RETIRADO_EXCLUYENTE")
    private String modelo_retirado_excluyente;

    @SerializedName("COMPONENTE_EXCLUYENTE")
    private String componente_excluyente;

    @SerializedName("CONECTIVIDAD_INSTALADO")
    private String conectividad_instalado;

    @SerializedName("CONECTIVIDAD_RETIRADO")
    private String conectividad_retirado;

    @SerializedName("CODIGO0")
    private String codigo0;

    @SerializedName("LITERAL_CODIGO0")
    private String literal_codigo0;

    @SerializedName("CODIGO")
    private String codigo;

    @SerializedName("LITERAL_CODIGO")
    private String literal_codigo;

    @SerializedName("SUBCODIGO1")
    private String subcodigo1;

    @SerializedName("LITERAL_SUBCODIGO1")
    private String literal_subcodigo1;

    @SerializedName("SUBCODIGO2")
    private String subcodigo2;

    @SerializedName("LITERAL_SUBCODIGO2")
    private String literal_subcodigo2;

    @SerializedName("SUBCODIGO3")
    private String subcodigo3;

    @SerializedName("LITERAL_SUBCODIGO3")
    private String literal_subcodigo3;

    @SerializedName("SEVERIDAD_AVERIA")
    private String severidad_averia;

    @SerializedName("SITUACION")
    private String situacion;

    @SerializedName("FIRMA")
    private String firma;

    @SerializedName("FOTO")
    private String foto;

    @SerializedName("OBSERVACIONES")
    private String observaciones;

    @SerializedName("LITERAL_OBSERVACIONES")
    private String literal_observaciones;

    @SerializedName("CARACTERES_OBSERVACIONES")
    private String caracteres_observaciones;

    @SerializedName("ADICIONAL")
    private String adicional;

    @SerializedName("LITERAL_ADICIONAL")
    private String literal_adicional;

    @SerializedName("CALENDARIO")
    private String calendario;

    @SerializedName("LITERAL_CALENDARIO")
    private String literal_calendario;

    @SerializedName("CODIGO_CIERRE")
    private String codigo_cierre;

    @SerializedName("LITERAL_CODIGO_CIERRE")
    private String literal_codigo_cierre;

    @SerializedName("LITERAL_SITUACION")
    private String literal_situacion;

    @SerializedName("TIPO_SITUACION")
    private String tipo_situacion;

    @SerializedName("ACTIVO")
    private String activo;

    @SerializedName("RETIRA_CONSUMIBLE")
    private String retira_consumible;

    @SerializedName("INSTALA_CONSUMIBLE")
    private String instala_consumible;

    @SerializedName("NUMERO_FOTOS")
    private String numero_fotos;

    @SerializedName("LITERALES_FOTOS")
    private String literales_fotos;

    @NonNull
    public String getId_casuistica_acciones() {
        return id_casuistica_acciones;
    }

    public CasuisticaAcciones(@NonNull String id_casuistica_acciones, String total_registros, String cliente_excluyente, String trabajo_excluyente, String trabajo, String tipo_trabajo, String retirar, String instalar, String retira_adicional, String instala_adicional, String tecnologia_excluyente, String modelo_instalado_excluyente, String modelo_retirado_excluyente, String componente_excluyente, String conectividad_instalado, String conectividad_retirado, String codigo0, String literal_codigo0, String codigo, String literal_codigo, String subcodigo1, String literal_subcodigo1, String subcodigo2, String literal_subcodigo2, String subcodigo3, String literal_subcodigo3, String severidad_averia, String situacion, String firma, String foto, String observaciones, String literal_observaciones, String caracteres_observaciones, String adicional, String literal_adicional, String calendario, String literal_calendario, String codigo_cierre, String literal_codigo_cierre, String literal_situacion, String tipo_situacion, String activo, String retira_consumible, String instala_consumible, String numero_fotos, String literales_fotos) {
        this.id_casuistica_acciones = id_casuistica_acciones;
        this.total_registros = total_registros;
        this.cliente_excluyente = cliente_excluyente;
        this.trabajo_excluyente = trabajo_excluyente;
        this.trabajo = trabajo;
        this.tipo_trabajo = tipo_trabajo;
        this.retirar = retirar;
        this.instalar = instalar;
        this.retira_adicional = retira_adicional;
        this.instala_adicional = instala_adicional;
        this.tecnologia_excluyente = tecnologia_excluyente;
        this.modelo_instalado_excluyente = modelo_instalado_excluyente;
        this.modelo_retirado_excluyente = modelo_retirado_excluyente;
        this.componente_excluyente = componente_excluyente;
        this.conectividad_instalado = conectividad_instalado;
        this.conectividad_retirado = conectividad_retirado;
        this.codigo0 = codigo0;
        this.literal_codigo0 = literal_codigo0;
        this.codigo = codigo;
        this.literal_codigo = literal_codigo;
        this.subcodigo1 = subcodigo1;
        this.literal_subcodigo1 = literal_subcodigo1;
        this.subcodigo2 = subcodigo2;
        this.literal_subcodigo2 = literal_subcodigo2;
        this.subcodigo3 = subcodigo3;
        this.literal_subcodigo3 = literal_subcodigo3;
        this.severidad_averia = severidad_averia;
        this.situacion = situacion;
        this.firma = firma;
        this.foto = foto;
        this.observaciones = observaciones;
        this.literal_observaciones = literal_observaciones;
        this.caracteres_observaciones = caracteres_observaciones;
        this.adicional = adicional;
        this.literal_adicional = literal_adicional;
        this.calendario = calendario;
        this.literal_calendario = literal_calendario;
        this.codigo_cierre = codigo_cierre;
        this.literal_codigo_cierre = literal_codigo_cierre;
        this.literal_situacion = literal_situacion;
        this.tipo_situacion = tipo_situacion;
        this.activo = activo;
        this.retira_consumible = retira_consumible;
        this.instala_consumible = instala_consumible;
        this.numero_fotos = numero_fotos;
        this.literales_fotos = literales_fotos;
    }

    public void setId_casuistica_acciones(@NonNull String id_casuistica_acciones) {
        this.id_casuistica_acciones = id_casuistica_acciones;
    }

    public String getTotal_registros() {
        return total_registros;
    }

    public void setTotal_registros(String total_registros) {
        this.total_registros = total_registros;
    }

    public String getCliente_excluyente() {
        return cliente_excluyente;
    }

    public void setCliente_excluyente(String cliente_excluyente) {
        this.cliente_excluyente = cliente_excluyente;
    }

    public String getTrabajo_excluyente() {
        return trabajo_excluyente;
    }

    public void setTrabajo_excluyente(String trabajo_excluyente) {
        this.trabajo_excluyente = trabajo_excluyente;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getTipo_trabajo() {
        return tipo_trabajo;
    }

    public void setTipo_trabajo(String tipo_trabajo) {
        this.tipo_trabajo = tipo_trabajo;
    }

    public String getRetirar() {
        return retirar;
    }

    public void setRetirar(String retirar) {
        this.retirar = retirar;
    }

    public String getInstalar() {
        return instalar;
    }

    public void setInstalar(String instalar) {
        this.instalar = instalar;
    }

    public String getRetira_adicional() {
        return retira_adicional;
    }

    public void setRetira_adicional(String retira_adicional) {
        this.retira_adicional = retira_adicional;
    }

    public String getInstala_adicional() {
        return instala_adicional;
    }

    public void setInstala_adicional(String instala_adicional) {
        this.instala_adicional = instala_adicional;
    }

    public String getTecnologia_excluyente() {
        return tecnologia_excluyente;
    }

    public void setTecnologia_excluyente(String tecnologia_excluyente) {
        this.tecnologia_excluyente = tecnologia_excluyente;
    }

    public String getModelo_instalado_excluyente() {
        return modelo_instalado_excluyente;
    }

    public void setModelo_instalado_excluyente(String modelo_instalado_excluyente) {
        this.modelo_instalado_excluyente = modelo_instalado_excluyente;
    }

    public String getModelo_retirado_excluyente() {
        return modelo_retirado_excluyente;
    }

    public void setModelo_retirado_excluyente(String modelo_retirado_excluyente) {
        this.modelo_retirado_excluyente = modelo_retirado_excluyente;
    }

    public String getComponente_excluyente() {
        return componente_excluyente;
    }

    public void setComponente_excluyente(String componente_excluyente) {
        this.componente_excluyente = componente_excluyente;
    }

    public String getConectividad_instalado() {
        return conectividad_instalado;
    }

    public void setConectividad_instalado(String conectividad_instalado) {
        this.conectividad_instalado = conectividad_instalado;
    }

    public String getConectividad_retirado() {
        return conectividad_retirado;
    }

    public void setConectividad_retirado(String conectividad_retirado) {
        this.conectividad_retirado = conectividad_retirado;
    }

    public String getCodigo0() {
        return codigo0;
    }

    public void setCodigo0(String codigo0) {
        this.codigo0 = codigo0;
    }

    public String getLiteral_codigo0() {
        return literal_codigo0;
    }

    public void setLiteral_codigo0(String literal_codigo0) {
        this.literal_codigo0 = literal_codigo0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLiteral_codigo() {
        return literal_codigo;
    }

    public void setLiteral_codigo(String literal_codigo) {
        this.literal_codigo = literal_codigo;
    }

    public String getSubcodigo1() {
        return subcodigo1;
    }

    public void setSubcodigo1(String subcodigo1) {
        this.subcodigo1 = subcodigo1;
    }

    public String getLiteral_subcodigo1() {
        return literal_subcodigo1;
    }

    public void setLiteral_subcodigo1(String literal_subcodigo1) {
        this.literal_subcodigo1 = literal_subcodigo1;
    }

    public String getSubcodigo2() {
        return subcodigo2;
    }

    public void setSubcodigo2(String subcodigo2) {
        this.subcodigo2 = subcodigo2;
    }

    public String getLiteral_subcodigo2() {
        return literal_subcodigo2;
    }

    public void setLiteral_subcodigo2(String literal_subcodigo2) {
        this.literal_subcodigo2 = literal_subcodigo2;
    }

    public String getSubcodigo3() {
        return subcodigo3;
    }

    public void setSubcodigo3(String subcodigo3) {
        this.subcodigo3 = subcodigo3;
    }

    public String getLiteral_subcodigo3() {
        return literal_subcodigo3;
    }

    public void setLiteral_subcodigo3(String literal_subcodigo3) {
        this.literal_subcodigo3 = literal_subcodigo3;
    }

    public String getSeveridad_averia() {
        return severidad_averia;
    }

    public void setSeveridad_averia(String severidad_averia) {
        this.severidad_averia = severidad_averia;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getLiteral_observaciones() {
        return literal_observaciones;
    }

    public void setLiteral_observaciones(String literal_observaciones) {
        this.literal_observaciones = literal_observaciones;
    }

    public String getCaracteres_observaciones() {
        return caracteres_observaciones;
    }

    public void setCaracteres_observaciones(String caracteres_observaciones) {
        this.caracteres_observaciones = caracteres_observaciones;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    public String getLiteral_adicional() {
        return literal_adicional;
    }

    public void setLiteral_adicional(String literal_adicional) {
        this.literal_adicional = literal_adicional;
    }

    public String getCalendario() {
        return calendario;
    }

    public void setCalendario(String calendario) {
        this.calendario = calendario;
    }

    public String getLiteral_calendario() {
        return literal_calendario;
    }

    public void setLiteral_calendario(String literal_calendario) {
        this.literal_calendario = literal_calendario;
    }

    public String getCodigo_cierre() {
        return codigo_cierre;
    }

    public void setCodigo_cierre(String codigo_cierre) {
        this.codigo_cierre = codigo_cierre;
    }

    public String getLiteral_codigo_cierre() {
        return literal_codigo_cierre;
    }

    public void setLiteral_codigo_cierre(String literal_codigo_cierre) {
        this.literal_codigo_cierre = literal_codigo_cierre;
    }

    public String getLiteral_situacion() {
        return literal_situacion;
    }

    public void setLiteral_situacion(String literal_situacion) {
        this.literal_situacion = literal_situacion;
    }

    public String getTipo_situacion() {
        return tipo_situacion;
    }

    public void setTipo_situacion(String tipo_situacion) {
        this.tipo_situacion = tipo_situacion;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getRetira_consumible() {
        return retira_consumible;
    }

    public void setRetira_consumible(String retira_consumible) {
        this.retira_consumible = retira_consumible;
    }

    public String getInstala_consumible() {
        return instala_consumible;
    }

    public void setInstala_consumible(String instala_consumible) {
        this.instala_consumible = instala_consumible;
    }

    public String getNumero_fotos() {
        return numero_fotos;
    }

    public void setNumero_fotos(String numero_fotos) {
        this.numero_fotos = numero_fotos;
    }

    public String getLiterales_fotos() {
        return literales_fotos;
    }

    public void setLiterales_fotos(String literales_fotos) {
        this.literales_fotos = literales_fotos;
    }
}
