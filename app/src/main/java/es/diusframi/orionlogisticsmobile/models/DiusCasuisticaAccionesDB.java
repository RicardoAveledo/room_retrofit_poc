package es.diusframi.orionlogisticsmobile.models;


import androidx.room.Entity;
import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_casuistica_acciones")
public class DiusCasuisticaAccionesDB {

    @PrimaryKey
    @SerializedName("id_casuistica_acciones")
    private int id_casuistica_acciones;

    @SerializedName("total_registros")
    private int total_registros;

    @SerializedName("cliente_excluyente")
    private int cliente_excluyente;

    @SerializedName("trabajo_excluyente")
    private int trabajo_excluyente;

    @SerializedName("trabajo")
    private int trabajo;

    @SerializedName("tipo_trabajo")
    private String tipo_trabajo;

    @SerializedName("retirar")
    private int retirar;

    @SerializedName("instalar")
    private int instalar;

    @SerializedName("retira_adicional")
    private int retira_adicional;

    @SerializedName("instala_adicional")
    private int instala_adicional;

    @SerializedName("tecnologia_excluyente")
    private int tecnologia_excluyente;

    @SerializedName("modelo_instalado_excluyente")
    private int modelo_instalado_excluyente;

    @SerializedName("modelo_retirado_excluyente")
    private int modelo_retirado_excluyente;

    @SerializedName("componente_excluyente")
    private int componente_excluyente;

    @SerializedName("conectividad_instalado")
    private int conectividad_instalado;

    @SerializedName("conectividad_retirado")
    private int conectividad_retirado;

    @SerializedName("codigo0")
    private int codigo0;

    @SerializedName("literal_codigo0")
    private String literal_codigo0;

    @SerializedName("codigo")
    private int codigo;

    @SerializedName("literal_codigo")
    private String literal_codigo;

    @SerializedName("subcodigo1")
    private int subcodigo1;

    @SerializedName("literal_subcodigo1")
    private String literal_subcodigo1;

    @SerializedName("subcodigo2")
    private int subcodigo2;

    @SerializedName("literal_subcodigo2")
    private String literal_subcodigo2;

    @SerializedName("subcodigo3")
    private int subcodigo3;

    @SerializedName("literal_subcodigo3")
    private String literal_subcodigo3;

    @SerializedName("severidad_averia")
    private String severidad_averia;

    @SerializedName("situacion")
    private int situacion;

    @SerializedName("firma")
    private int firma;

    @SerializedName("foto")
    private int foto;

    @SerializedName("observaciones")
    private int observaciones;

    @SerializedName("literal_observaciones")
    private String literal_observaciones;

    @SerializedName("caracteres_observaciones")
    private int caracteres_observaciones;

    @SerializedName("adicional")
    private int adicional;

    @SerializedName("literal_adicional")
    private String literal_adicional;

    @SerializedName("calendario")
    private int calendario;

    @SerializedName("literal_calendario")
    private String literal_calendario;

    @SerializedName("codigo_cierre")
    private int codigo_cierre;

    @SerializedName("literal_codigo_cierre")
    private String literal_codigo_cierre;

    @SerializedName("literal_situacion")
    private String literal_situacion;

    @SerializedName("tipo_situacion")
    private String tipo_situacion;

    @SerializedName("activo")
    private int activo;

    @SerializedName("retira_consumible")
    private int retira_consumible;

    @SerializedName("instala_consumible")
    private int instala_consumible;

    @SerializedName("numero_fotos")
    private int numero_fotos;

    @SerializedName("literales_fotos")
    private String literales_fotos;

    public DiusCasuisticaAccionesDB(int id_casuistica_acciones, int total_registros, int cliente_excluyente, int trabajo_excluyente, int trabajo, String tipo_trabajo, int retirar, int instalar, int retira_adicional, int instala_adicional, int tecnologia_excluyente, int modelo_instalado_excluyente, int modelo_retirado_excluyente, int componente_excluyente, int conectividad_instalado, int conectividad_retirado, int codigo0, String literal_codigo0, int codigo, String literal_codigo, int subcodigo1, String literal_subcodigo1, int subcodigo2, String literal_subcodigo2, int subcodigo3, String literal_subcodigo3, String severidad_averia, int situacion, int firma, int foto, int observaciones, String literal_observaciones, int caracteres_observaciones, int adicional, String literal_adicional, int calendario, String literal_calendario, int codigo_cierre, String literal_codigo_cierre, String literal_situacion, String tipo_situacion, int activo, int retira_consumible, int instala_consumible, int numero_fotos, String literales_fotos) {
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

    public int getId_casuistica_acciones() {
        return id_casuistica_acciones;
    }

    public void setId_casuistica_acciones(int id_casuistica_acciones) {
        this.id_casuistica_acciones = id_casuistica_acciones;
    }

    public int getTotal_registros() {
        return total_registros;
    }

    public void setTotal_registros(int total_registros) {
        this.total_registros = total_registros;
    }

    public int getCliente_excluyente() {
        return cliente_excluyente;
    }

    public void setCliente_excluyente(int cliente_excluyente) {
        this.cliente_excluyente = cliente_excluyente;
    }

    public int getTrabajo_excluyente() {
        return trabajo_excluyente;
    }

    public void setTrabajo_excluyente(int trabajo_excluyente) {
        this.trabajo_excluyente = trabajo_excluyente;
    }

    public int getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(int trabajo) {
        this.trabajo = trabajo;
    }

    public String getTipo_trabajo() {
        return tipo_trabajo;
    }

    public void setTipo_trabajo(String tipo_trabajo) {
        this.tipo_trabajo = tipo_trabajo;
    }

    public int getRetirar() {
        return retirar;
    }

    public void setRetirar(int retirar) {
        this.retirar = retirar;
    }

    public int getInstalar() {
        return instalar;
    }

    public void setInstalar(int instalar) {
        this.instalar = instalar;
    }

    public int getRetira_adicional() {
        return retira_adicional;
    }

    public void setRetira_adicional(int retira_adicional) {
        this.retira_adicional = retira_adicional;
    }

    public int getInstala_adicional() {
        return instala_adicional;
    }

    public void setInstala_adicional(int instala_adicional) {
        this.instala_adicional = instala_adicional;
    }

    public int getTecnologia_excluyente() {
        return tecnologia_excluyente;
    }

    public void setTecnologia_excluyente(int tecnologia_excluyente) {
        this.tecnologia_excluyente = tecnologia_excluyente;
    }

    public int getModelo_instalado_excluyente() {
        return modelo_instalado_excluyente;
    }

    public void setModelo_instalado_excluyente(int modelo_instalado_excluyente) {
        this.modelo_instalado_excluyente = modelo_instalado_excluyente;
    }

    public int getModelo_retirado_excluyente() {
        return modelo_retirado_excluyente;
    }

    public void setModelo_retirado_excluyente(int modelo_retirado_excluyente) {
        this.modelo_retirado_excluyente = modelo_retirado_excluyente;
    }

    public int getComponente_excluyente() {
        return componente_excluyente;
    }

    public void setComponente_excluyente(int componente_excluyente) {
        this.componente_excluyente = componente_excluyente;
    }

    public int getConectividad_instalado() {
        return conectividad_instalado;
    }

    public void setConectividad_instalado(int conectividad_instalado) {
        this.conectividad_instalado = conectividad_instalado;
    }

    public int getConectividad_retirado() {
        return conectividad_retirado;
    }

    public void setConectividad_retirado(int conectividad_retirado) {
        this.conectividad_retirado = conectividad_retirado;
    }

    public int getCodigo0() {
        return codigo0;
    }

    public void setCodigo0(int codigo0) {
        this.codigo0 = codigo0;
    }

    public String getLiteral_codigo0() {
        return literal_codigo0;
    }

    public void setLiteral_codigo0(String literal_codigo0) {
        this.literal_codigo0 = literal_codigo0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLiteral_codigo() {
        return literal_codigo;
    }

    public void setLiteral_codigo(String literal_codigo) {
        this.literal_codigo = literal_codigo;
    }

    public int getSubcodigo1() {
        return subcodigo1;
    }

    public void setSubcodigo1(int subcodigo1) {
        this.subcodigo1 = subcodigo1;
    }

    public String getLiteral_subcodigo1() {
        return literal_subcodigo1;
    }

    public void setLiteral_subcodigo1(String literal_subcodigo1) {
        this.literal_subcodigo1 = literal_subcodigo1;
    }

    public int getSubcodigo2() {
        return subcodigo2;
    }

    public void setSubcodigo2(int subcodigo2) {
        this.subcodigo2 = subcodigo2;
    }

    public String getLiteral_subcodigo2() {
        return literal_subcodigo2;
    }

    public void setLiteral_subcodigo2(String literal_subcodigo2) {
        this.literal_subcodigo2 = literal_subcodigo2;
    }

    public int getSubcodigo3() {
        return subcodigo3;
    }

    public void setSubcodigo3(int subcodigo3) {
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

    public int getSituacion() {
        return situacion;
    }

    public void setSituacion(int situacion) {
        this.situacion = situacion;
    }

    public int getFirma() {
        return firma;
    }

    public void setFirma(int firma) {
        this.firma = firma;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(int observaciones) {
        this.observaciones = observaciones;
    }

    public String getLiteral_observaciones() {
        return literal_observaciones;
    }

    public void setLiteral_observaciones(String literal_observaciones) {
        this.literal_observaciones = literal_observaciones;
    }

    public int getCaracteres_observaciones() {
        return caracteres_observaciones;
    }

    public void setCaracteres_observaciones(int caracteres_observaciones) {
        this.caracteres_observaciones = caracteres_observaciones;
    }

    public int getAdicional() {
        return adicional;
    }

    public void setAdicional(int adicional) {
        this.adicional = adicional;
    }

    public String getLiteral_adicional() {
        return literal_adicional;
    }

    public void setLiteral_adicional(String literal_adicional) {
        this.literal_adicional = literal_adicional;
    }

    public int getCalendario() {
        return calendario;
    }

    public void setCalendario(int calendario) {
        this.calendario = calendario;
    }

    public String getLiteral_calendario() {
        return literal_calendario;
    }

    public void setLiteral_calendario(String literal_calendario) {
        this.literal_calendario = literal_calendario;
    }

    public int getCodigo_cierre() {
        return codigo_cierre;
    }

    public void setCodigo_cierre(int codigo_cierre) {
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

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public int getRetira_consumible() {
        return retira_consumible;
    }

    public void setRetira_consumible(int retira_consumible) {
        this.retira_consumible = retira_consumible;
    }

    public int getInstala_consumible() {
        return instala_consumible;
    }

    public void setInstala_consumible(int instala_consumible) {
        this.instala_consumible = instala_consumible;
    }

    public int getNumero_fotos() {
        return numero_fotos;
    }

    public void setNumero_fotos(int numero_fotos) {
        this.numero_fotos = numero_fotos;
    }

    public String getLiterales_fotos() {
        return literales_fotos;
    }

    public void setLiterales_fotos(String literales_fotos) {
        this.literales_fotos = literales_fotos;
    }
}
