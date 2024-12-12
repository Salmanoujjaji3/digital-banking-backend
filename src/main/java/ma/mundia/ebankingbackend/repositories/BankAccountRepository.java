package ma.mundia.ebankingbackend.repositories;

import ma.mundia.ebankingbackend.entities.BankAccount;
import ma.mundia.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
