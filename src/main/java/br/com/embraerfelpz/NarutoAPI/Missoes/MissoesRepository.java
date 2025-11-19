package br.com.embraerfelpz.NarutoAPI.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;
                                                                    // Long por conta do ID MissoesModel
public interface MissoesRepository  extends JpaRepository<MissoesModel, Long> {
}
