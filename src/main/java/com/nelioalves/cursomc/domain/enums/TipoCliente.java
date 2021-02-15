package com.nelioalves.cursomc.domain.enums;

import java.util.Arrays;

public enum TipoCliente {
	PESSOAFISICA(1, "Pessoa Física"), PESSOAJURIDICA(2, "Pessoa Jurídica");

	private Integer cod;
	private String descricao;

	private TipoCliente(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		return Arrays.asList(TipoCliente.values()).stream().filter(tc -> tc.getCod().equals(cod)).findAny()
				.orElseThrow(()->new IllegalArgumentException("Id inválido "+ cod));
	}

}
