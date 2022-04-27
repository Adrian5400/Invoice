
/**
 * Clase para hacer facturas y aplicar iva
 * @author Programador Bajeril
 *
 */
public class Invoice {
	double total;
	double subtotal;
	
	public Invoice (double subtotal) {
		this.subtotal = subtotal;
	}
	
	/**
	 *  le aplica al total el iva reducido
	 *  y se guarda en el total
	 */
	public void ivaReduction () {
		total = subtotal + (subtotal * 0.21d);
	}

	/**
	 *  le aplica al total el iva normal
	 *  y se guarda en el total
	 */
	public void totalIva () {
		total = subtotal + (subtotal * 0.04d);		
	}
	
	/**
	 * le aplica un descuento especial fijo
	 * que se aplica a clientes VIP
	 */
	public void vipDiscount () {
		total = subtotal - (subtotal * 0.10d);
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
}
