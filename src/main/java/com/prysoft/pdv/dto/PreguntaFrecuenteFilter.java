package com.prysoft.pdv.dto;

public class PreguntaFrecuenteFilter extends PageFilter{
    private String preguntaFrecuenteQuestion;
    private String preguntaFrecuenteResponse;

    public String getPreguntaFrecuenteQuestion() {
        return preguntaFrecuenteQuestion;
    }

    public void setPreguntaFrecuenteQuestion(String preguntaFrecuenteQuestion) {
        this.preguntaFrecuenteQuestion = preguntaFrecuenteQuestion;
    }

    public String getPreguntaFrecuenteResponse() {
        return preguntaFrecuenteResponse;
    }

    public void setPreguntaFrecuenteResponse(String preguntaFrecuenteResponse) {
        this.preguntaFrecuenteResponse = preguntaFrecuenteResponse;
    }

    @Override
    public int getPage() {
        return super.getPage();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public String toString() {
        return "PreguntaFrecuenteFilter{" +
                "preguntaFrecuenteQuestion='" + preguntaFrecuenteQuestion + '\'' +
                ", preguntaFrecuenteResponse='" + preguntaFrecuenteResponse + '\'' +
                '}';
    }
}
