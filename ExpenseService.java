@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;
    @Autowired
    private UserRepository userRepository;

    public Expense addExpense(Expense expense) {
        // Validate and calculate split
        return expenseRepository.save(expense);
    }

    public List<Expense> getUserExpenses(Long userId) {
        // Retrieve user's expenses
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
}
