package com.algaworks.algafood.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.api.model.FormaPagamentoModel;
import com.algaworks.algafood.domain.model.FormaPagamento;

@Component
public class FormaPagamentoAssembler {
	
	@Autowired
	ModelMapper modelMapper;
	
	
	public FormaPagamentoModel toModel(FormaPagamento formaPagamento) {
		return modelMapper.map(formaPagamento, FormaPagamentoModel.class);
		
	}
	
	public List<FormaPagamentoModel> toCollectionModel(List<FormaPagamento> formasPagamento){
		return formasPagamento.stream()
				.map(formaPagamento-> toModel(formaPagamento))
				.collect(Collectors.toList());
	}

}