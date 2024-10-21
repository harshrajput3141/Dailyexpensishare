@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private String splitMethod; // "EQUAL", "EXACT", "PERCENTAGE"
    
    @OneToMany(mappedBy = "expense")
    private List<ExpenseDetail> expenseDetails;

    // Getters and Setters
}
