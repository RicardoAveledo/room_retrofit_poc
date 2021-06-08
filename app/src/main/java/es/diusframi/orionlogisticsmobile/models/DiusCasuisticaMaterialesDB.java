package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_casuistica_materiales")
public class DiusCasuisticaMaterialesDB {

    @PrimaryKey
    @SerializedName("id_casuistica_materiales")
    private int id_casuistica_materiales;

    @SerializedName("retirar")
    private int retirar;

    @SerializedName("instalar")
    private int instalar;

    @SerializedName("trabajo")
    private int trabajo;

    @SerializedName("compania")
    private int compania;

    @SerializedName("material")
    private int material;

    @SerializedName("nombre_material")
    private String nombre_material;

    @SerializedName("tipo_material")
    private String tipo_material;

    @SerializedName("longitud_serie")
    private int longitud_serie;

    @SerializedName("modelo_material")
    private int modelo_material;

    @SerializedName("conectividad_material")
    private int conectividad_material;

    @SerializedName("cliente_material")
    private int cliente_material;

    @SerializedName("elementos_adiconales")
    private int elementos_adiconales;

    @SerializedName("componentes")
    private int componentes;

    @SerializedName("consumibles")
    private int consumibles;

    @SerializedName("literal_instalar_equipo")
    private String literal_instalar_equipo;

    @SerializedName("literal_retirar_equipo")
    private String literal_retirar_equipo;

    @SerializedName("literal_instalar_componente")
    private String literal_instalar_componente;

    @SerializedName("literal_retirar_componente")
    private String literal_retirar_componente;

    @SerializedName("literal_isntalar_consumible")
    private String literal_isntalar_consumible;

    @SerializedName("literal_retirar_consumible")
    private String literal_retirar_consumible;

    @SerializedName("codigo")
    private String codigo;

    @SerializedName("subcodigo1")
    private String subcodigo1;

    @SerializedName("subcodigo2")
    private String subcodigo2;

    @SerializedName("modelo_adicional_ins_obligatorio")
    private String modelo_adicional_ins_obligatorio;

    @SerializedName("modelo_adicional_ret_obligatorio")
    private String modelo_adicional_ret_obligatorio;

    @SerializedName("autoconsumo")
    private String autoconsumo;

    @SerializedName("activo")
    private int activo;

    @SerializedName("tecnologia")
    private int tecnologia;

    @SerializedName("codigo0")
    private String codigo0;

    @SerializedName("subcodigo3")
    private String subcodigo3;

    public DiusCasuisticaMaterialesDB(int id_casuistica_materiales, int retirar, int instalar, int trabajo, int compania, int material, String nombre_material, String tipo_material, int longitud_serie, int modelo_material, int conectividad_material, int cliente_material, int elementos_adiconales, int componentes, int consumibles, String literal_instalar_equipo, String literal_retirar_equipo, String literal_instalar_componente, String literal_retirar_componente, String literal_isntalar_consumible, String literal_retirar_consumible, String codigo, String subcodigo1, String subcodigo2, String modelo_adicional_ins_obligatorio, String modelo_adicional_ret_obligatorio, String autoconsumo, int activo, int tecnologia, String codigo0, String subcodigo3) {
        this.id_casuistica_materiales = id_casuistica_materiales;
        this.retirar = retirar;
        this.instalar = instalar;
        this.trabajo = trabajo;
        this.compania = compania;
        this.material = material;
        this.nombre_material = nombre_material;
        this.tipo_material = tipo_material;
        this.longitud_serie = longitud_serie;
        this.modelo_material = modelo_material;
        this.conectividad_material = conectividad_material;
        this.cliente_material = cliente_material;
        this.elementos_adiconales = elementos_adiconales;
        this.componentes = componentes;
        this.consumibles = consumibles;
        this.literal_instalar_equipo = literal_instalar_equipo;
        this.literal_retirar_equipo = literal_retirar_equipo;
        this.literal_instalar_componente = literal_instalar_componente;
        this.literal_retirar_componente = literal_retirar_componente;
        this.literal_isntalar_consumible = literal_isntalar_consumible;
        this.literal_retirar_consumible = literal_retirar_consumible;
        this.codigo = codigo;
        this.subcodigo1 = subcodigo1;
        this.subcodigo2 = subcodigo2;
        this.modelo_adicional_ins_obligatorio = modelo_adicional_ins_obligatorio;
        this.modelo_adicional_ret_obligatorio = modelo_adicional_ret_obligatorio;
        this.autoconsumo = autoconsumo;
        this.activo = activo;
        this.tecnologia = tecnologia;
        this.codigo0 = codigo0;
        this.subcodigo3 = subcodigo3;
    }

    public int getId_casuistica_materiales() {
        return id_casuistica_materiales;
    }

    public void setId_casuistica_materiales(int id_casuistica_materiales) {
        this.id_casuistica_materiales = id_casuistica_materiales;
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

    public int getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(int trabajo) {
        this.trabajo = trabajo;
    }

    public int getCompania() {
        return compania;
    }

    public void setCompania(int compania) {
        this.compania = compania;
    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public String getNombre_material() {
        return nombre_material;
    }

    public void setNombre_material(String nombre_material) {
        this.nombre_material = nombre_material;
    }

    public String getTipo_material() {
        return tipo_material;
    }

    public void setTipo_material(String tipo_material) {
        this.tipo_material = tipo_material;
    }

    public int getLongitud_serie() {
        return longitud_serie;
    }

    public void setLongitud_serie(int longitud_serie) {
        this.longitud_serie = longitud_serie;
    }

    public int getModelo_material() {
        return modelo_material;
    }

    public void setModelo_material(int modelo_material) {
        this.modelo_material = modelo_material;
    }

    public int getConectividad_material() {
        return conectividad_material;
    }

    public void setConectividad_material(int conectividad_material) {
        this.conectividad_material = conectividad_material;
    }

    public int getCliente_material() {
        return cliente_material;
    }

    public void setCliente_material(int cliente_material) {
        this.cliente_material = cliente_material;
    }

    public int getElementos_adiconales() {
        return elementos_adiconales;
    }

    public void setElementos_adiconales(int elementos_adiconales) {
        this.elementos_adiconales = elementos_adiconales;
    }

    public int getComponentes() {
        return componentes;
    }

    public void setComponentes(int componentes) {
        this.componentes = componentes;
    }

    public int getConsumibles() {
        return consumibles;
    }

    public void setConsumibles(int consumibles) {
        this.consumibles = consumibles;
    }

    public String getLiteral_instalar_equipo() {
        return literal_instalar_equipo;
    }

    public void setLiteral_instalar_equipo(String literal_instalar_equipo) {
        this.literal_instalar_equipo = literal_instalar_equipo;
    }

    public String getLiteral_retirar_equipo() {
        return literal_retirar_equipo;
    }

    public void setLiteral_retirar_equipo(String literal_retirar_equipo) {
        this.literal_retirar_equipo = literal_retirar_equipo;
    }

    public String getLiteral_instalar_componente() {
        return literal_instalar_componente;
    }

    public void setLiteral_instalar_componente(String literal_instalar_componente) {
        this.literal_instalar_componente = literal_instalar_componente;
    }

    public String getLiteral_retirar_componente() {
        return literal_retirar_componente;
    }

    public void setLiteral_retirar_componente(String literal_retirar_componente) {
        this.literal_retirar_componente = literal_retirar_componente;
    }

    public String getLiteral_isntalar_consumible() {
        return literal_isntalar_consumible;
    }

    public void setLiteral_isntalar_consumible(String literal_isntalar_consumible) {
        this.literal_isntalar_consumible = literal_isntalar_consumible;
    }

    public String getLiteral_retirar_consumible() {
        return literal_retirar_consumible;
    }

    public void setLiteral_retirar_consumible(String literal_retirar_consumible) {
        this.literal_retirar_consumible = literal_retirar_consumible;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSubcodigo1() {
        return subcodigo1;
    }

    public void setSubcodigo1(String subcodigo1) {
        this.subcodigo1 = subcodigo1;
    }

    public String getSubcodigo2() {
        return subcodigo2;
    }

    public void setSubcodigo2(String subcodigo2) {
        this.subcodigo2 = subcodigo2;
    }

    public String getModelo_adicional_ins_obligatorio() {
        return modelo_adicional_ins_obligatorio;
    }

    public void setModelo_adicional_ins_obligatorio(String modelo_adicional_ins_obligatorio) {
        this.modelo_adicional_ins_obligatorio = modelo_adicional_ins_obligatorio;
    }

    public String getModelo_adicional_ret_obligatorio() {
        return modelo_adicional_ret_obligatorio;
    }

    public void setModelo_adicional_ret_obligatorio(String modelo_adicional_ret_obligatorio) {
        this.modelo_adicional_ret_obligatorio = modelo_adicional_ret_obligatorio;
    }

    public String getAutoconsumo() {
        return autoconsumo;
    }

    public void setAutoconsumo(String autoconsumo) {
        this.autoconsumo = autoconsumo;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public int getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(int tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getCodigo0() {
        return codigo0;
    }

    public void setCodigo0(String codigo0) {
        this.codigo0 = codigo0;
    }

    public String getSubcodigo3() {
        return subcodigo3;
    }

    public void setSubcodigo3(String subcodigo3) {
        this.subcodigo3 = subcodigo3;
    }
}
