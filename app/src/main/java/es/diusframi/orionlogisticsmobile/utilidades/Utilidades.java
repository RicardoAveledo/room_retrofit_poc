package es.diusframi.orionlogisticsmobile.utilidades;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import java.util.ArrayList;
import java.util.List;

import es.diusframi.orionlogisticsmobile.R;
import es.diusframi.orionlogisticsmobile.models.Almacen;
import es.diusframi.orionlogisticsmobile.models.Equipo;

public class Utilidades {
    public static String tokenAPI = "";
    public static List<Almacen> almacenes;
    public static ArrayList<String> opcionesEscaneoRapido = new ArrayList<String>();
    public static ArrayList<String> opcionesDispositivoEscaneo = new ArrayList<String>();
    public static String opcionEscaneoRapido = "";
    public static String opcionDispositivoEscaneo = "";

    public static void changeDispositivoEscaneoToCamera(Context mContext){
        SharedPreferences sharedPref = ((Activity)mContext).getSharedPreferences("OLM",0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("dispositivoEscaneo", "Cámara");
        editor.commit();
        editor.apply();
        Utilidades.opcionDispositivoEscaneo = "Cámara";
    }
    public static void showEquipoDetalle(Equipo equipo, Context mContext){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(mContext);
        //dialogBuilder.setTitle("Detalle del equipo");
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );

        View titleView = inflater.inflate(R.layout.tittle_scanner_detalles_equipo, null);

        dialogBuilder.setCustomTitle(titleView);

        View dialogView = inflater.inflate(R.layout.layout_detalles_equipo_dialog, null);
        dialogBuilder.setView(dialogView);

        Button buttonClose = (Button)titleView.findViewById(R.id.buttonClose);


        TextView serieInformacion = (TextView) dialogView.findViewById(R.id.serieInformacion);
        TextView productoInformacion = (TextView) dialogView.findViewById(R.id.productoInformacion);
        TextView descripcionInformacion = (TextView) dialogView.findViewById(R.id.descripcionInformacion);
        TextView varianteInformacion = (TextView) dialogView.findViewById(R.id.varianteInformacion);
        TextView estadoInformacion = (TextView) dialogView.findViewById(R.id.estadoInformacion);
        TextView descripcionEstadoInformacion = (TextView) dialogView.findViewById(R.id.descripcionEstadoInformacion);
        TextView codUbicacionInformacion = (TextView) dialogView.findViewById(R.id.codUbicacionInformacion);
        TextView nombreUbicacionInformacion = (TextView) dialogView.findViewById(R.id.nombreUbicacionInformacion);
        TextView almacenInformacion = (TextView) dialogView.findViewById(R.id.almacenInformacion);
        TextView nSerieFabricanteNavInformacion = (TextView) dialogView.findViewById(R.id.nSerieFabricanteNavInformacion);
        TextView clienteInformacion = (TextView) dialogView.findViewById(R.id.clienteInformacion);
        TextView ultimoCambioEstadoInformacion = (TextView) dialogView.findViewById(R.id.ultimoCambioEstadoInformacion);
        TextView fhGarantiaNavInformacion = (TextView) dialogView.findViewById(R.id.fhGarantiaNavInformacion);
        TextView desCodigoCierreInformacion = (TextView) dialogView.findViewById(R.id.desCodigoCierreInformacion);
        TextView tipoActuacionInformacion = (TextView) dialogView.findViewById(R.id.tipoActuacionInformacion);
        TextView circuitoInformacion = (TextView) dialogView.findViewById(R.id.circuitoInformacion);
        TextView fechaAltaInformacion = (TextView) dialogView.findViewById(R.id.fechaAltaInformacion);
        TextView nombreAlmacenInformacion = (TextView) dialogView.findViewById(R.id.nombreAlmacenInformacion);
        TextView rellenoInformacion = (TextView) dialogView.findViewById(R.id.rellenoInformacion);
        TextView fechaRegUltMovAlmacenInformacion = (TextView) dialogView.findViewById(R.id.fechaRegUltMovAlmacenInformacion);
        TextView vSwInformacion = (TextView) dialogView.findViewById(R.id.vSwInformacion);
        TextView vSwProductoInformacion = (TextView) dialogView.findViewById(R.id.vSwProductoInformacion);
        TextView fhVigenciaSwInformacion = (TextView) dialogView.findViewById(R.id.fhVigenciaSwInformacion);
        TextView urlVersionSwInformacion = (TextView) dialogView.findViewById(R.id.urlVersionSwInformacion);
        TextView swActualizadoInformacion = (TextView) dialogView.findViewById(R.id.swActualizadoInformacion);
        TextView numeroInventarioInformacion = (TextView) dialogView.findViewById(R.id.numeroInventarioInformacion);
        TextView circuitoIngenicoComerciaInformacion = (TextView) dialogView.findViewById(R.id.circuitoIngenicoComerciaInformacion);
        TextView refClienteInformacion = (TextView) dialogView.findViewById(R.id.refClienteInformacion);
        TextView codigoUlInformacion = (TextView) dialogView.findViewById(R.id.codigoUlInformacion);
        TextView serieEscaneadoInformacion = (TextView) dialogView.findViewById(R.id.serieEscaneadoInformacion);

        LinearLayout serieLayout = (LinearLayout) dialogView.findViewById(R.id.serieLayout);
        LinearLayout productoLayout = (LinearLayout) dialogView.findViewById(R.id.productoLayout);
        LinearLayout descripcionLayout = (LinearLayout) dialogView.findViewById(R.id.descripcionLayout);
        LinearLayout varianteLayout = (LinearLayout) dialogView.findViewById(R.id.varianteLayout);
        LinearLayout estadoLayout = (LinearLayout) dialogView.findViewById(R.id.estadoLayout);
        LinearLayout descripcionEstadoLayout = (LinearLayout) dialogView.findViewById(R.id.descripcionEstadoLayout);
        LinearLayout codUbicacionLayout = (LinearLayout) dialogView.findViewById(R.id.codUbicacionLayout);
        LinearLayout nombreUbicacionLayout = (LinearLayout) dialogView.findViewById(R.id.nombreUbicacionLayout);
        LinearLayout almacenLayout = (LinearLayout) dialogView.findViewById(R.id.almacenLayout);
        LinearLayout nSerieFabricanteNavLayout = (LinearLayout) dialogView.findViewById(R.id.nSerieFabricanteNavLayout);
        LinearLayout clienteLayout = (LinearLayout) dialogView.findViewById(R.id.clienteLayout);
        LinearLayout ultimoCambioEstadoLayout = (LinearLayout) dialogView.findViewById(R.id.ultimoCambioEstadoLayout);
        LinearLayout fhGarantiaNavLayout = (LinearLayout) dialogView.findViewById(R.id.fhGarantiaNavLayout);
        LinearLayout desCodigoCierreLayout = (LinearLayout) dialogView.findViewById(R.id.desCodigoCierreLayout);
        LinearLayout tipoActuacionLayout = (LinearLayout) dialogView.findViewById(R.id.tipoActuacionLayout);
        LinearLayout circuitoLayout = (LinearLayout) dialogView.findViewById(R.id.circuitoLayout);
        LinearLayout fechaAltaLayout = (LinearLayout) dialogView.findViewById(R.id.fechaAltaLayout);
        LinearLayout nombreAlmacenLayout = (LinearLayout) dialogView.findViewById(R.id.nombreAlmacenLayout);
        LinearLayout rellenoLayout = (LinearLayout) dialogView.findViewById(R.id.rellenoLayout);
        LinearLayout fechaRegUltMovAlmacenLayout = (LinearLayout) dialogView.findViewById(R.id.fechaRegUltMovAlmacenLayout);
        LinearLayout vSwLayout = (LinearLayout) dialogView.findViewById(R.id.vSwLayout);
        LinearLayout vSwProductoLayout = (LinearLayout) dialogView.findViewById(R.id.vSwProductoLayout);
        LinearLayout fhVigenciaSwLayout = (LinearLayout) dialogView.findViewById(R.id.fhVigenciaSwLayout);
        LinearLayout urlVersionSwLayout = (LinearLayout) dialogView.findViewById(R.id.urlVersionSwLayout);
        LinearLayout swActualizadoLayout = (LinearLayout) dialogView.findViewById(R.id.swActualizadoLayout);
        LinearLayout numeroInventarioLayout = (LinearLayout) dialogView.findViewById(R.id.numeroInventarioLayout);
        LinearLayout circuitoIngenicoComerciaLayout = (LinearLayout) dialogView.findViewById(R.id.circuitoIngenicoComerciaLayout);
        LinearLayout refClienteLayout = (LinearLayout) dialogView.findViewById(R.id.refClienteLayout);
        LinearLayout codigoUlLayout = (LinearLayout) dialogView.findViewById(R.id.codigoUlLayout);
        LinearLayout serieEscaneadoLayout = (LinearLayout) dialogView.findViewById(R.id.serieEscaneadoLayout);

        try {
            serieInformacion.setText(equipo.getSerie() + "");
            productoInformacion.setText(equipo.getProducto() + "");
            descripcionInformacion.setText(equipo.getDescripcion() + "");
            varianteInformacion.setText(equipo.getVariante() + "");
            estadoInformacion.setText(equipo.getEstado() + "");
            descripcionEstadoInformacion.setText(equipo.getDescripcion_estado() + "");
            codUbicacionInformacion.setText(equipo.getCod_ubicacion() + "");
            nombreUbicacionInformacion.setText(equipo.getNombre_ubicacion() + "");
            almacenInformacion.setText(equipo.getNombre_almacen() + "");
            nSerieFabricanteNavInformacion.setText(equipo.getN_serie_fabricante_nav() + "");
            clienteInformacion.setText(equipo.getCliente() + "");
            ultimoCambioEstadoInformacion.setText(equipo.getUltimo_cambio_estado() + "");
            fhGarantiaNavInformacion.setText(equipo.getFh_garantia_nav() + "");
            desCodigoCierreInformacion.setText(equipo.getDes_codigo_cierre() + "");
            tipoActuacionInformacion.setText(equipo.getTipo_actuacion() + "");
            circuitoInformacion.setText(equipo.getCircuito() + "");
            fechaAltaInformacion.setText(equipo.getFecha_alta() + "");
            nombreAlmacenInformacion.setText(equipo.getNombre_almacen() + "");
            rellenoInformacion.setText(equipo.getRelleno() + "");
            fechaRegUltMovAlmacenInformacion.setText(equipo.getFecha_reg_ult_mov_almacen() + "");
            vSwInformacion.setText(equipo.getV_sw() + "");
            vSwProductoInformacion.setText(equipo.getV_sw_producto() + "");
            fhVigenciaSwInformacion.setText(equipo.getFh_vigencia_sw() + "");
            urlVersionSwInformacion.setText(equipo.getUrl_version_sw() + "");
            swActualizadoInformacion.setText(equipo.getSw_actualizado() + "");
            numeroInventarioInformacion.setText(equipo.getNumero_inventario() + "");
            circuitoIngenicoComerciaInformacion.setText(equipo.getCircuito_ingenico_comercia() + "");
            refClienteInformacion.setText(equipo.getRef_cliente() + "");
            codigoUlInformacion.setText(equipo.getCodigo_ul() + "");
            serieEscaneadoInformacion.setText(equipo.getSerie_escaneado() + "");
        } catch (Exception e) {
            e.printStackTrace();
        }


        if((equipo.getSerie() + "").equals("") || (equipo.getSerie() + "").equals(" ") || (equipo.getSerie() + "").equals("null")){
            serieLayout.setVisibility(View.GONE);
        }
        if((equipo.getProducto() + "").equals("") || (equipo.getProducto() + "").equals(" ") || (equipo.getProducto() + "").equals("null")){
            productoLayout.setVisibility(View.GONE);
        }
        if((equipo.getDescripcion() + "").equals("") || (equipo.getDescripcion() + "").equals(" ") || (equipo.getDescripcion() + "").equals("null")){
            descripcionLayout.setVisibility(View.GONE);
        }
        if((equipo.getVariante() + "").equals("") || (equipo.getVariante() + "").equals(" ") || (equipo.getVariante() + "").equals("null")){
            varianteLayout.setVisibility(View.GONE);
        }
        if((equipo.getEstado() + "").equals("") || (equipo.getEstado() + "").equals(" ") || (equipo.getEstado() + "").equals("null")){
            estadoLayout.setVisibility(View.GONE);
        }
        if((equipo.getDescripcion_estado() + "").equals("") || (equipo.getDescripcion_estado() + "").equals(" ") || (equipo.getDescripcion_estado() + "").equals("null")){
            descripcionEstadoLayout.setVisibility(View.GONE);
        }
        if((equipo.getCod_ubicacion() + "").equals("") || (equipo.getCod_ubicacion() + "").equals(" ") || (equipo.getCod_ubicacion() + "").equals("null")){
            codUbicacionLayout.setVisibility(View.GONE);
        }
        if((equipo.getNombre_ubicacion() + "").equals("") || (equipo.getNombre_ubicacion() + "").equals(" ") || (equipo.getNombre_ubicacion() + "").equals("null")){
            nombreUbicacionLayout.setVisibility(View.GONE);
        }
        if((equipo.getNombre_almacen() + "").equals("") || (equipo.getNombre_almacen() + "").equals(" ") || (equipo.getNombre_almacen() + "").equals("null")){
            almacenLayout.setVisibility(View.GONE);
        }
        if((equipo.getN_serie_fabricante_nav() + "").equals("") || (equipo.getN_serie_fabricante_nav() + "").equals(" ") || (equipo.getN_serie_fabricante_nav() + "").equals("null")){
            nSerieFabricanteNavLayout.setVisibility(View.GONE);
        }
        if((equipo.getCliente() + "").equals("") || (equipo.getCliente() + "").equals(" ") || (equipo.getCliente() + "").equals("null")){
            clienteLayout.setVisibility(View.GONE);
        }
        if((equipo.getUltimo_cambio_estado() + "").equals("") || (equipo.getUltimo_cambio_estado() + "").equals(" ") || (equipo.getUltimo_cambio_estado() + "").equals("null")){
            ultimoCambioEstadoLayout.setVisibility(View.GONE);
        }
        if((equipo.getFh_garantia_nav() + "").equals("") || (equipo.getFh_garantia_nav() + "").equals(" ") || (equipo.getFh_garantia_nav() + "").equals("null")){
            fhGarantiaNavLayout.setVisibility(View.GONE);
        }
        if((equipo.getDes_codigo_cierre() + "").equals("") || (equipo.getDes_codigo_cierre() + "").equals(" ") || (equipo.getDes_codigo_cierre() + "").equals("null")){
            desCodigoCierreLayout.setVisibility(View.GONE);
        }
        if((equipo.getTipo_actuacion() + "").equals("") || (equipo.getTipo_actuacion() + "").equals(" ") || (equipo.getTipo_actuacion() + "").equals("null")){
            tipoActuacionLayout.setVisibility(View.GONE);
        }
        if((equipo.getCircuito() + "").equals("") || (equipo.getCircuito() + "").equals(" ") || (equipo.getCircuito() + "").equals("null")){
            circuitoLayout.setVisibility(View.GONE);
        }
        if((equipo.getFecha_alta() + "").equals("") || (equipo.getFecha_alta() + "").equals(" ") || (equipo.getFecha_alta() + "").equals("null")){
            fechaAltaLayout.setVisibility(View.GONE);
        }
        if((equipo.getNombre_almacen() + "").equals("") || (equipo.getNombre_almacen() + "").equals(" ") || (equipo.getNombre_almacen() + "").equals("null")){
            nombreAlmacenLayout.setVisibility(View.GONE);
        }
        if((equipo.getRelleno() + "").equals("") || (equipo.getRelleno() + "").equals(" ") || (equipo.getRelleno() + "").equals("null")){
            rellenoLayout.setVisibility(View.GONE);
        }
        if((equipo.getFecha_reg_ult_mov_almacen() + "").equals("") || (equipo.getFecha_reg_ult_mov_almacen() + "").equals(" ") || (equipo.getFecha_reg_ult_mov_almacen() + "").equals("null")){
            fechaRegUltMovAlmacenLayout.setVisibility(View.GONE);
        }
        if((equipo.getV_sw() + "").equals("") || (equipo.getV_sw() + "").equals(" ") || (equipo.getV_sw() + "").equals("null")){
            vSwLayout.setVisibility(View.GONE);
        }
        if((equipo.getV_sw_producto() + "").equals("") || (equipo.getV_sw_producto() + "").equals(" ") || (equipo.getV_sw_producto() + "").equals("null")){
            vSwProductoLayout.setVisibility(View.GONE);
        }
        if((equipo.getFh_vigencia_sw() + "").equals("") || (equipo.getFh_vigencia_sw() + "").equals(" ") || (equipo.getFh_vigencia_sw() + "").equals("null")){
            fhVigenciaSwLayout.setVisibility(View.GONE);
        }
        if((equipo.getUrl_version_sw() + "").equals("") || (equipo.getUrl_version_sw() + "").equals(" ") || (equipo.getUrl_version_sw() + "").equals("null")){
            urlVersionSwLayout.setVisibility(View.GONE);
        }
        if((equipo.getSw_actualizado() + "").equals("") || (equipo.getSw_actualizado() + "").equals(" ") || (equipo.getSw_actualizado() + "").equals("null")){
            swActualizadoLayout.setVisibility(View.GONE);
        }
        if((equipo.getNumero_inventario() + "").equals("") || (equipo.getNumero_inventario() + "").equals(" ") || (equipo.getNumero_inventario() + "").equals("null")){
            numeroInventarioLayout.setVisibility(View.GONE);
        }
        if((equipo.getCircuito_ingenico_comercia() + "").equals("") || (equipo.getCircuito_ingenico_comercia() + "").equals(" ") || (equipo.getCircuito_ingenico_comercia() + "").equals("null")){
            circuitoIngenicoComerciaLayout.setVisibility(View.GONE);
        }
        if((equipo.getRef_cliente() + "").equals("") || (equipo.getRef_cliente() + "").equals(" ") || (equipo.getRef_cliente() + "").equals("null")){
            refClienteLayout.setVisibility(View.GONE);
        }
        if((equipo.getCodigo_ul() + "").equals("") || (equipo.getCodigo_ul() + "").equals(" ") || (equipo.getCodigo_ul() + "").equals("null")){
            codigoUlLayout.setVisibility(View.GONE);
        }
        if((equipo.getSerie_escaneado() + "").equals("") || (equipo.getSerie_escaneado() + "").equals(" ") || (equipo.getSerie_escaneado() + "").equals("null")){
            serieEscaneadoLayout.setVisibility(View.GONE);
        }

 
        AlertDialog alertDialog = dialogBuilder.create();

        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });

        alertDialog.show();
        
    }
}
