package pp.config;

import java.util.List;
import java.util.Map;

import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import pp.telas.Configuracao;

public class ConfiguracaoConfig  {
	Configuracao c = new Configuracao();
	public void addTextoRespostas(JRadioButton radio1, JRadioButton radio2, JRadioButton radio3, JRadioButton radio4, JRadioButton radio5, JRadioButton radio6, JRadioButton radio7, JRadioButton radio8, JRadioButton radio9,
			JTextField txt1,JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6, JTextField txt7, JTextField txt8, JTextField txt9){
		radio1.setText(txt1.getText());
		radio2.setText(txt2.getText());
		radio3.setText(txt3.getText());
		radio4.setText(txt4.getText());
		radio5.setText(txt5.getText());
		radio6.setText(txt6.getText());
		radio7.setText(txt7.getText());
		radio8.setText(txt8.getText());
		radio9.setText(txt9.getText());
	}
	public void addPeruntasRespostas(List<String> lista,Map<String, List<String>> mapa,
			JRadioButton radio1, JRadioButton radio2, JRadioButton radio3, JRadioButton radio4, JRadioButton radio5, JRadioButton radio6, JRadioButton radio7, JRadioButton radio8, JRadioButton radio9,
			JTextArea txtArea){
		
		if(radio1.getText() !=null){
			lista.add(radio1.getText());			
		}else if(radio2.getText() != null){
			lista.add(radio2.getText());
		}else if(radio3.getText() != null){
			lista.add(radio3.getText());
		}else if(radio4.getText() != null){
			lista.add(radio4.getText());
		}else if(radio5.getText() != null){
			lista.add(radio5.getText());
		}else if(radio6.getText() != null){
			lista.add(radio6.getText());
		}else if(radio7.getText() != null){
			lista.add(radio7.getText());
		}else if(radio8.getText() != null){
			lista.add(radio8.getText());
		}else if(radio9.getText() != null){
			lista.add(radio9.getText());
		}
		mapa.put(txtArea.getText(), lista);
	}
	
}
