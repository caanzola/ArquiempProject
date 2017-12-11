/*
 * The MIT License
 *
 * Copyright 2017 Universidad De Los Andes - Departamento de Ingeniería de Sistemas.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package co.edu.uniandes.isis2503.nosqljpa.interfaces;

import co.edu.uniandes.isis2503.nosqljpa.model.dto.model.MeasurementDTO;
import java.util.List;

/**
 *
 * @author grupo2
 *
 * La interface actua como una facade
 */
public interface IMeasurementLogic {
    public MeasurementDTO add(MeasurementDTO dto);
    public MeasurementDTO update(MeasurementDTO dto);
    public MeasurementDTO find(String id);
    public List<MeasurementDTO> all();
    public Boolean delete(String id);
    public MeasurementDTO findLast();
    public Boolean deleteAll();
    public List<MeasurementDTO> lastest(String pUbicacion, String pVariable);
    public Boolean fueraRango(String pUbicacion, String pVariable, double pLimInferior, double pLimSuperior);
    public List<MeasurementDTO> ubicacion(String pUbicacion);
}
