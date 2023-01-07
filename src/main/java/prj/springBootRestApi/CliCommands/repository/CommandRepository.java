package prj.springBootRestApi.CliCommands.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prj.springBootRestApi.CliCommands.model.Command;

public interface CommandRepository extends JpaRepository<Command, Integer> {
}
