package com.vehiculos.views.detallevehiculo;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vehiculos.views.MainLayout;

@PageTitle("DetalleVehiculo")
@Route(value = "detalle-vehiculo", layout = MainLayout.class)
@Uses(Icon.class)
public class DetalleVehiculoView extends Composite<VerticalLayout> {

    public DetalleVehiculoView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H4 h4 = new H4();
        H5 h5 = new H5();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        H4 h42 = new H4();
        H5 h52 = new H5();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        H4 h43 = new H4();
        H5 h53 = new H5();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        h4.setText("Placa:");
        h4.setWidth("max-content");
        h5.setText("placa");
        h5.setWidth("max-content");
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.setHeight("min-content");
        h42.setText("Marca:");
        h42.setWidth("max-content");
        h52.setText("marca");
        h52.setWidth("max-content");
        layoutRow3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.setHeight("min-content");
        h43.setText("Año:");
        h43.setWidth("max-content");
        h53.setText("anio");
        h53.setWidth("max-content");
        getContent().add(layoutRow);
        layoutRow.add(h4);
        layoutRow.add(h5);
        getContent().add(layoutRow2);
        layoutRow2.add(h42);
        layoutRow2.add(h52);
        getContent().add(layoutRow3);
        layoutRow3.add(h43);
        layoutRow3.add(h53);
    }
}
