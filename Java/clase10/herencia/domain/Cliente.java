package herencia.domain;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int contadorClientes;

	public Cliente(String nombre, char genero, int edad, String direccion, Date fechaRegistro, boolean vip) {
		super(nombre, genero, edad, direccion);
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
		this.idCliente = ++Cliente.contadorClientes;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cliente{ idCliente=").append(idCliente);
		sb.append(", fechaRegistro=").append(fechaRegistro);
		sb.append(", vip=").append(vip);
		sb.append(", ").append(super.toString());
		sb.append(" }");
		return sb.toString();
	}

}