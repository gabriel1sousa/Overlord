/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvd.ebac.cliente.exception;

/**
 *
 * @author gabri
 */
public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = -7339546357706827674L;

	public BadRequestException(String message) {
        super(message);
    }

}
